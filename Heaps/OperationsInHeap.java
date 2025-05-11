package Heaps;
import java.util.*;

public class OperationsInHeap {
    static class Heap {
        ArrayList<Integer> list = new ArrayList<>();
        
        public void add(int data) {// O(logn)
            // add element in the last
            list.add(data);

            // fix heap
            int child = list.size()-1;
            int par = (child-1)/2;

            while(list.get(par) > list.get(child)) { // O(logn)
                // swap
                int temp = list.get(par);
                list.set(par, list.get(child));
                list.set(child, temp);

                child = par;
                par = (child-1)/2;
            }
        }

        public int peek() {  // O(1)
            return list.get(0);
        }

        // private recursive function heapify - used to fix the heap
        private void heapify(int i) {
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < list.size() && list.get(left) < list.get(minIdx)) {
                minIdx = left;
            }

            if(right < list.size() && list.get(right) < list.get(minIdx)) {
                minIdx = right;
            }

            // swap elements of minIdx and i
            if(minIdx != i) {
                int temp = list.get(minIdx);
                list.set(minIdx, list.get(i));
                list.set(i, temp);

                heapify(minIdx);
            }

        }

        public int remove() { // O(logn)
            int data = list.get(0);

            // swap with the last variable
            int temp = list.get(list.size()-1);
            list.set(list.size()-1, list.get(0));
            list.set(0, temp);

            // remove the last element
            list.remove(list.size()-1);

            // fix heap by calling heapify

            heapify(0); // O(logn)

            return data;
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(3);
        h.add(2);
        h.add(5);
        h.add(1);

        while(!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

    }
    
}
