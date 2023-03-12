import java.util.*;

public class ComputenCrm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int m = sc.nextInt();
        int nf = fact(n);
        int rf = fact(r);
        int nrf = fact(n - r);
        System.out.println(((int) nf / (nrf * rf)) % m);
    }

    public static int fact(int x) {
        if (x == 1)
            return 1;
        return x * fact(x - 1);
    }
}
