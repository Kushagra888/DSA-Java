package GraphsOne;
import java.util.*;

public class Dijkstra {
    // shortest path from source to all vertices
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

    static class Pair implements Comparable<Pair> {
        int n;
        int dist;

        public Pair(int n, int dist) {
            this.n = n;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {    // O(n*logn) for sorting 
            return this.dist - p2.dist;
        }
    }

    // dijkstra's algorithm - bfs approach follow
    // O ( V + ElogV)
    public static void dijkstra(ArrayList<Edge> graph[], int src, boolean vis[]) {
        int dist[] = new int[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0; i<dist.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE; // infinity
            }
        }

        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!vis[curr.n]) {
                vis[curr.n] = true;

                for(int i=0; i<graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // printing the shortest distances
        for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));


        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        dijkstra(graph, 0, new boolean[V]);


    }

}
