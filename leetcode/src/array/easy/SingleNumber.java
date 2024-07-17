package array.easy;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        /*
            If we take XOR of zero and some bit, it will return that bit
            a \oplus 0 = aa⊕0=a
            If we take XOR of two same bits, it will return 0
            a \oplus a = 0a⊕a=0
            a \oplus b \oplus a = (a \oplus a) \oplus b = 0 \oplus b = ba⊕b⊕a=(a⊕a)⊕b=0⊕b=b
         */
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,4,1,4};
        int output = singleNumber(nums);
        System.out.print(output);
    }
}
