package GraphsTwo;
import java.util.*;
// we have used curr.cost because we need the curr path not the global min path of dist[u]=src

public class CheapestFlightsWithinKStops {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    static class Pair {
        int v;
        int cost;
        int stps;

        public Pair(int v, int cost, int stps) {
            this.v = v;
            this.cost = cost;
            this.stps = stps;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int flights[][]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }

    public static int cheapestFlights(ArrayList<Edge> graph[], int src, int dest, int k, int n) {
        Queue<Pair> q = new LinkedList<>();

        int dist[] = new int[n];
        for(int i=0; i<n; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        q.add(new Pair(src, 0, 0));

        while(!q.isEmpty()) {
            Pair curr = q.remove();
            if(curr.stps > k) {
                break;
            }

            for(int i=0; i<graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                // int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost + wt < dist[v] && curr.stps <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Pair(v, dist[v], curr.stps+1));
                }
            }
        }

        if(dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}};
        int src = 0, dest = 3, k = 1;

        ArrayList<Edge> graph[] = new ArrayList[n];

        createGraph(graph, flights);

        System.out.println(cheapestFlights(graph, src, dest, k, n));
    }

}
