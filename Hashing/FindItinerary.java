package Hashing;
import java.util.*;


public class FindItinerary { // find itinerary from tickets, journey.

    public static String getStart(HashMap<String,String> map) {
        HashMap<String,String> revMap = new HashMap<>();

        for(String k : map.keySet()) {
            revMap.put(map.get(k), k);
        }

        for(String k : map.keySet()) {
            if(!revMap.containsKey(k)) {
                return k;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);

        System.out.print(start);

        // for(String k: map.keySet()) {
        //     System.out.print( "-->" + map.get(start));
        //     start = map.get(start);
        // }
    }

}
