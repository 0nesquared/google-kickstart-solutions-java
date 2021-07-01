import java.util.Scanner;

public class B_2020_1 {

    public static String solve(Scanner sc)
    {
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++)
        {
            H[i] = sc.nextInt();
        }

        int peaks = 0;
        for (int i = 1; i < N - 1; i++)
        {
            if (H[i] > H[i - 1] && H[i] > H[i + 1])
            {
                peaks++;
                i++;
            }
        }

        return String.valueOf(peaks);
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
