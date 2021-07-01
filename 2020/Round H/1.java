import java.util.Scanner;

public class H_2020_1 {
    public static String solve(Scanner sc)
    {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();

        long time = Math.min((long)N + K, (long)N + 2 * (K - S));

        return String.valueOf(time);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++)
        {
            System.out.printf("Case #%d: %s%n", i, solve(sc));
        }
    }
}