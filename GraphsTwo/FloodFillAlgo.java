package GraphsTwo;

public class FloodFillAlgo {
    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int  orgColor) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length 
            || vis[sr][sc] 
            || image[sr][sc] != orgColor) {
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        // left
        helper(image, sr, sc-1, color, vis, orgColor);
        // right
        helper(image, sr, sc+1, color, vis, orgColor);
        // up
        helper(image, sr-1, sc, color, vis, orgColor);
        // down
        helper(image, sr+1, sc, color, vis, orgColor);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        int orgColor = image[sr][sc];
        helper(image, sr, sc, color, vis, orgColor);
        return image;
    }

    public static void main(String[] args) {
        int image[][] = {{1,1,1}, 
                        {1,1,0},
                        {1,0,1}};

        int sr = 1, sc = 1, color = 2;

        int resImg[][] = floodFill(image, sr, sc, color);

        for(int i=0; i<resImg.length; i++) {
            for(int j=0; j<resImg[0].length; j++) {
                System.out.print(resImg[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}