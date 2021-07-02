import java.util.*;

public class A_2020_1 {

    public static String solve(Scanner sc)
    {
        // Taking input
        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        // Sorting the array in Ascending order
        Arrays.sort(A);

        // Greedy approach - Pick the cheapest house, and decrement the budget accordingly
        // The maximum houses selected this way would be our answer
        int count = 0;
        for (int i = 0; i < N && B > 0; i++)
        {
            B -= A[i];
            count += B >= 0 ? 1 : 0;
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
