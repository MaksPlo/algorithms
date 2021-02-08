import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        List<Integer> triangle;
        List<List<Integer>> triangles = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            triangle = new ArrayList<Integer>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle.add(1);
                } else if (triangles.size() >= i) {
                    triangle.add(triangles.get(i - 1).get(j - 1) + triangles.get(i - 1).get(j));
                }
            }
            triangles.add(triangle);
        }

        return triangles;
    }
}
