package dynamicProgramming.easy;

public class FirstBadVersion {

    static boolean isBadVersion(int version) {
        int firstBadVersion = 8;
        return version >= firstBadVersion;
    }

    static int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    static int binarySearch(int left, int right) {
        if (left > right)
            return left;
        int mid = (right - left)/2 + left;
        boolean bad = isBadVersion(mid);
        if (bad) {
            return binarySearch(left, mid-1);
        }
        else {
            return binarySearch(mid+1, right);
        }
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }
}
