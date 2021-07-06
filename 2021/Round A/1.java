import java.util.Scanner;

public class A_2021_1 {

    public static String solve(Scanner sc) {
        // taking the input
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        // We can just calculate the goodness score
        // Min. no. of operations needed = |K - goodness_score|

        int gs = 0;
        for (int i = 0; i < N / 2; i++) {
            if (S.charAt(i) != S.charAt(N - i - 1))
                gs++;
        }

        return String.valueOf(Math.abs(gs - K));
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
