import java.util.*;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (pcount(i) == 2)
                c++;
        }
        System.out.println(c);
    }

    public static boolean isPrime(int x) {
        int f = 0;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                f = 1;
                break;
            }
        }
        if (f == 1)
            return false;
        return true;
    }

    public static int pcount(int y) {
        int cnt = 0;
        for (int i = 2; i <= y; i++) {
            if (isPrime(i))
                cnt++;
        }
        return cnt;
    }
}