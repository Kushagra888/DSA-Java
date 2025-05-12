package GraphsOne;
import java.util.*;

public class DFS {
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

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int src) { // O(V+E)

        System.out.print(src + " ");
        vis[src] = true;

        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!vis[e.dest]) {
                dfs(graph, vis, e.dest);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 2));


        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

        dfs(graph, new boolean[V], 0);
    }
}
