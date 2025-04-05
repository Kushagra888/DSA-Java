package Stacks;
import java.util.Stack;

public class MaxAreaInHistogram {   // O(n)
    
    public static void calcMax(int height[]) {
        Stack<Integer> s = new Stack<>();

        int nsl[] = new int[height.length];
        int nsr[] = new int[height.length];

        // next smaller left   O(n)
        for(int i=0; i<height.length; i++) {
            while(!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }


        // next smaller right   O(n)

        s = new Stack<>();

        for(int i=height.length-1; i>=0; i--) {
            while(!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // max area  O(n)
        int maxArea = 0;

        for(int i=0; i<height.length; i++) {
            int ht = height[i];
            int wdth = nsr[i] - nsl[i] - 1;

            int currArea = ht * wdth;
            maxArea = Math.max(maxArea, currArea);
        }

        // showing result

        System.out.println(maxArea);

    }

    public static void main(String[] args) {
        int height[] = {2, 1, 5, 6, 2, 3};

        calcMax(height);
    }
}

