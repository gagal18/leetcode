package dp;

public class exe_62 {
    public int uniquePaths(int m, int n) {
        int maze[][] = new int[m][n];
        maze[m-1][n-1] = 1;
        for (int i = n-1; i >= 0; i--) {
            maze[m-1][i] = 1;
        }
        for (int i = m-1; i >= 0; i--) {
            maze[i][n-1] = 1;
        }
        for (int i = m-2; i >= 0; i--) {
            for (int j = n-2; j >= 0; j--) {
                maze[i][j] = maze[i+1][j] +  maze[i][j+1];
            }
        }
        return maze[0][0];
    }
    public static void main(String[] args) {
        int maze = new exe_62().uniquePaths(3,7);
        System.out.println(maze);
    }
}
