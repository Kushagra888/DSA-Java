package Hashing;
import java.util.*;


public class HashMapCode {
    static class HashMap <K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no. of nodes in the bucket list.
        private int N; // size of bucket list.

        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hashCode = key.hashCode();

            return Math.abs(hashCode) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for(int i=0; i<ll.size(); i++) {
                Node node = ll.get(i);
                if(key == node.key) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehashing() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = N * 2;
            // initializing the new bucket list
            for(int i=0; i<buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // valid or -1, data index

            if(di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            // rehashing
            double k = 2.0; // k is constant 
            double lambda = (double) n / N;

            if(lambda > k) {
                rehashing();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // valid or -1, data index

            if(di != -1) {
                return true;
            } else {
                return false;
            }

        }

        public V get(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // valid or -1, data index

            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }

        }

        public V remove(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // valid or -1, data index

            if(di != -1) {
                Node node = buckets[bi].remove(di);
                return node.value;
            } else {
                return null;
            }

        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 180);
        map.put("Australia", 130);
        map.put("HongKong", 70);

        ArrayList<String> keys = map.keySet();

        for(String k : keys) {
            System.out.println(k);
        }

        System.out.println(map.get("India"));

        System.out.println(map.remove("China"));

        System.out.println(map.containsKey("HongKong"));
        System.out.println(map.containsKey("China"));
        System.out.println(map.isEmpty());

    }

}
