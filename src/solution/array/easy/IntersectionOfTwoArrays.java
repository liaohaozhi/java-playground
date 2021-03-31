package solution.array.easy;

import solution.Util;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static List<Integer> run(int[] array_a, int[] array_b) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int h = -1;
        while (i < array_a.length) {
            int j = 0;
            while (j < array_b.length) {
                if (array_a[i] == array_b[j]) {
                    h = j;
                    break;
                }
                j++;
            }
            if (h != -1) {
                break;
            }
            i++;
        }
        while (i < array_a.length && h < array_b.length) {
            if (array_a[i] != array_b[h]) {
                break;
            }
            intersection.add(array_a[i]);
            i++;
            h++;
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        List<Integer> intersection = run(a, b);
        System.out.print(intersection.toString());
    }

}
