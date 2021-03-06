import java.util.Scanner;

public class D_2020_1 {
    public static String solve(Scanner sc)
    {
        // Taking input
        int N = sc.nextInt();
        int[] V = new int[N];

        for (int i = 0; i < N; i++)
        {
            V[i] = sc.nextInt();
        }

        int count = 0;
        int maxV = -1; // We can't initialize max-visitors to be 0 since {0} is a possible input

        // Just iterate over the input and check the conditions for a record breaking day
        for (int i = 0; i < N; i++)
        {
            if (V[i] > maxV && (i == N - 1 || V[i + 1] < V[i]))
                count++;
            maxV = Math.max(maxV, V[i]);
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
