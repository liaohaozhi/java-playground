package solution.array.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMatrixZero {

    //time O(mxn), space O(m+n)
    public static void setZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> set = new HashSet<>();

        //first pass find all rows columns to be zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    int rowIndex = i;
                    int columnIndex = m+j;
                    if (!set.contains(rowIndex)) {
                        set.add(rowIndex);
                    }
                    if (!set.contains(columnIndex)) {
                        set.add(columnIndex);
                    }
                }
            }
        }

        //second pass set rows columns to zeros
        for (Integer key : set) {
            if (key < m) {
                matrix[key] = new int[n];
            }
            else {
                int col = key - m;
                for (int i = 0; i < m; i++) {
                    matrix[i][col] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeros(nums);
        System.out.println(nums);
    }
}
