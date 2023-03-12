import java.util.*;

public class countofdivisor {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int[] nums = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 1; j <= num[i] / 2; j++) {
                if (num[i] % j == 0) {
                    count++;
                }
            }
            nums[i] = ++count;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}