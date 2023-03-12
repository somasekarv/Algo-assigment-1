import java.util.*;

public class EnumeratingGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length(); i++) {
            x = x * 10 + a.charAt(i) - '0';
        }
        for (int i = 0; i < b.length(); i++) {
            y = y * 10 + b.charAt(i) - '0';
        }
        for (int i = y; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
