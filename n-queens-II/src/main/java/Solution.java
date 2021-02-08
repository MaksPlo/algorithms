public class Solution {

    private int count;
    private int[] col;
    private int[] diag1;
    private int[] diag2;
    int n;

    public int totalNQueens(int n) {
        count = 0;
        col = new int[n];
        diag1 = new int[2 * n - 1];
        diag2 = new int[2 * n - 1];
        this.n = n;
        search(0);
        return count;
    }

    private void search(int y) {
        if (y == n) {
            count++;
            return;
        }

        for (int x = 0; x < n; x++) {
            if (col[x] != 0 || diag1[x + y] != 0 || diag2[y - x + n - 1] != 0) {
                continue;
            }
            col[x] = diag1[x + y] = diag2[y - x  + n - 1] = 1;
            search(y+1);
            col[x] = diag1[x+y] = diag2[y - x  + n - 1] = 0;
        }
    }
}
