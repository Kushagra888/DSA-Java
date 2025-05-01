package Greedy;
import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 7, 6, 9, 9};

        // sorting based on end time
        int activities[][] = new int[start.length][3];
        // 0 -> idx
        // 1 -> start time
        // 2 -> end time

        for(int i=0; i<start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function - short form of bigger function - comparator -> sorting logic
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;


        // first activity
        maxAct++;
        ans.add(activities[0][0]);
        int lastActEndTime = activities[0][2];

        for(int i=1; i<activities.length; i++) {
            if(activities[i][1] >= lastActEndTime) { // start time >= lastActivityEndingTime
                maxAct++;
                ans.add(activities[i][0]);
                lastActEndTime = activities[i][2];
            }
        }

        System.out.println("Maximum activities: " + maxAct);

        for(int i=0; i<ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }

    }
}