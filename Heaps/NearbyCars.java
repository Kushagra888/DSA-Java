package Heaps;
import java.util.*;

public class NearbyCars {

    static class Car implements Comparable<Car> {
        int idx;
        int dist;

        public Car(int idx, int dist) {
            this.idx = idx;
            this.dist = dist; 
        }

        @Override
        public int compareTo(Car c2) {
            return this.dist - c2.dist;
        }
    }
    public static void main(String[] args) {
        int cars[][] = {{3,3} , {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Car> pq = new PriorityQueue<>();

        for(int i=0; i<cars.length; i++) {
            int distSq = (cars[i][0] * cars[i][0]) + (cars[i][1] * cars[i][1]);
            pq.add(new Car(i, distSq));
        }

        for(int i=0; i<k; i++) {
            System.out.println("C" + pq.peek().idx + "--->" + pq.peek().dist);
            pq.remove();
        }
        System.out.println();
    }

}

