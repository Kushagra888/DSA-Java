package GraphsOne;
import java.util.*;

//  print all paths from source to target/destination

public class PrintAllPaths {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // O(V^V) exponential
    public static void printAllPaths(ArrayList<Edge> graph[], int src, int tar, String path) {
        if(src == tar) {
            System.out.println(path+tar);
            return;
        }

        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllPaths(graph, e.dest, tar, path+src);
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 3, 1));


        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

        printAllPaths(graph, 5, 1, "");
    }
}