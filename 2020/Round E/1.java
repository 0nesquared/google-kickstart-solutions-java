import java.util.Scanner;

public class E_2020_1 {
    public static String solve(Scanner sc)
    {
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        int lengthMax = 0;
        for (int i = 0; i < N - 1;)
        {
            int j = i;
            int diff = A[i + 1] - A[i];
            while (j < N  - 1 && (A[j + 1] - A[j] == diff))
            {
                j++;
            }
            lengthMax = Math.max(lengthMax, j - i + 1);
            i = Math.max(i + 1, j);
        }

        return String.valueOf(lengthMax);
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