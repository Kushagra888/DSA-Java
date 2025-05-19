package GraphsTwo;
import java.util.*;
// greedy based approach to find mst
// O(ElogE)

public class Kruskals {
    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt-e2.wt;
        }
    }    

    public static void createGraph(PriorityQueue<Edge> pq) {
        pq.add(new Edge(0,1,10));
        pq.add(new Edge(0,2,15));
        pq.add(new Edge(0,3,30));
        pq.add(new Edge(1,3,40));
        pq.add(new Edge(2,3,50));
    }

    // disjoint set ds
    static int n = 4; // no. of vertices
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for(int i=0; i<par.length; i++) {
            par[i] = i;
        } 
    }

    public static int find(int x) {
        if(x == par[x]) {
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] > rank[parB]) {
            par[parB] = parA;
        } else {
            par[parA] = parB;
        }
    }

    public static void main(String[] args) {
        init();
        // PriorityQueue<Edge> pq = new PriorityQueue<>();
        // createGraph(pq);

        // int V = 4;
        // int finalCost = 0;
        // int count = 0;
        // // in mst, if v are no. of vertices in mst, then there will be v-1 edges in the mst;

        // for(int i=0; count<V-1; i++) {
        //     Edge e = pq.remove();

        //     int parA = find(e.src);
        //     int parB = find(e.dest);

        //     // if it doesn't form any cycle
        //     if(parA != parB) {
        //         union(e.src, e.dest);
        //         finalCost += e.wt;
        //         count++;
        //     }
        // }

        // System.out.println("final cost: " + finalCost);
    }
}
