package GraphsOne;
import java.util.*;

public class BFS {
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


    public static void bfs(ArrayList<Edge> graph[], int src) { // O(V+E)
        boolean vis[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(src);

        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
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

        bfs(graph, 0);

    }
}