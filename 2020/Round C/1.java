import java.util.Scanner;

public class C_2020_1 {

    public static String solve(Scanner sc)
    {
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
            if (A[i] == K)
            {
                int start = i++;
                while (i < N && (A[i - 1] - A[i] == 1))
                    i++;
                if (i - start == K)
                    count++;
                i--;
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
