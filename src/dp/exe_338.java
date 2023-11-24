package dp;

public class exe_338 {
    public static int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i = 0; i <= n; i++) {
            bits[i] = Integer.bitCount(i);
        }
        return bits;
    }

    public static void main(String[] args) {
        int[] a5 = countBits(5);
        System.out.println(a5.toString());
    }
}
