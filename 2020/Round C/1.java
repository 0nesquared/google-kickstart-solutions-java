import java.util.Scanner;

public class C_2020_1 {

    public static String solve(Scanner sc)
    {
        // Taking input
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++)
        {
            // Condition for an element to start a K-countdown
            if (A[i] == K)
            {
                int start = i++;
                // Incrementing i as long as the conditions of the countdown are met
                while (i < N && (A[i - 1] - A[i] == 1))
                    i++;
                if (i - start == K) // Checking if our count-down is a K-countdown
                    count++;
                i--; // Re-adjusting the index overshot by the while loop
            }
        }

        return String.valueOf(count);
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
