package Greedy;
import java.util.*;

public class JobsSequencing {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int d, int p, int i) {
            deadline = d;
            profit = p;
            id = i;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++) {
            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], i));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> ans = new ArrayList<>();

        int time = 0; int totalProfit = 0;

        for(int i=0; i<jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                time++;
                totalProfit += curr.profit;
                ans.add(curr.id);
            }
        }

        System.out.println("time: " + time);
        System.out.println("total profit: " + totalProfit);
        System.out.println("JOBS: ");
        System.out.println(ans);
        System.out.println("max jobs: " + ans.size());
        
    }
}
