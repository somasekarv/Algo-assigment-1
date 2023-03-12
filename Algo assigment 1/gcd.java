import java.util.*3 12 15 18;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxx = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxx)
                maxx = arr[i];
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int g = gcd(arr[i], arr, maxx, n);
            if (g > max) {
                max = g;
            }
        }
        System.out.println(max);
    }

    public static int gcd(int x, int[] arr, int maxx, int n) {
        int m = 0;
        for (int j = 1; j <= maxx; j++) {
            int f = 1;
            for (int k = 0; k < n; k++) {
                if (arr[k] != x) {
                    if (arr[k] % j != 0) {
                        f = 0;
                        break;
                    }
                }
            }
            if (f == 1) {
                m = j;
            }
        }
        return m;
    }
}
