import java.util.*;

public class PrimeSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] crr = primex(n);
        List<Integer> l2 = new ArrayList<>();
        l2.add(crr[0]);
        l2.add(crr[1]);
        System.out.println(l2);
    }

    public static int[] primex(int n) {
        int[] ans = new int[2];
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i <= n; i++) {
            int f = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                arr[i] = 1;
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 1) {
                l.add(i);
            }
        }
        for (int k : l) {
            for (int m : l) {
                if (k + m == n) {
                    ans[0] = k;
                    ans[1] = m;
                    return ans;
                }
            }
        }
        return ans;
    }
}
