package solution.array.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

    public static boolean valid(char[][] input) {
        //solution 1
        //go through all rows
        //go through all columns
        //go through all 3x3 squares


        //solution 2 - one pass
        Map<String, Set<Character>> map = new HashMap<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                for (String key : toKey(row, col)) {
                    if (map.containsKey(key) && map.get(key).contains(input[row][col]) && '.' != input[row][col]) {
                        System.out.print(row);
                        System.out.print(col);
                        return false;
                    }
                    if (!map.containsKey(key)) {
                        map.put(key, new HashSet<Character>());
                    }
                    map.get(key).add(input[row][col]);
                }
            }
        }
        return true;
    }

    public static String[] toKey(int row, int col) {
        String[] keys = new String[3];
        keys[0] = "row" + row;
        keys[1] = "col" + col;
        if (row < 3) {
            if (col < 3) {
                keys[2] = "square1";
            }
            else if (col < 6) {
                keys[2] = "square4";
            }
            else {
                keys[2] = "square7";
            }
        }
        else if (row < 6) {
            if (col < 3) {
                keys[2] = "square2";
            }
            else if (col < 6) {
                keys[2] = "square5";
            }
            else {
                keys[2] = "square8";
            }
        }
        else if (row < 9) {
            if (col < 3) {
                keys[2] = "square3";
            }
            else if (col < 6) {
                keys[2] = "square6";
            }
            else {
                keys[2] = "square9";
            }
        }
        return keys;
    }

    public static void main(String[] args) {
        char[][] input = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'5','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean isValid = valid(input);
        System.out.print(isValid);
    }
}
