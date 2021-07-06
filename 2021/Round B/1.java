import java.util.Scanner;

public class B_2021_1 {

    public static String solve(Scanner sc) {
        // taking the input
        int N = sc.nextInt();
        String S = sc.next();

        // StringBuilder to store the answer at each index
        // We should not use String concatenation inside the loop here
        // since it will result in TLE.
        StringBuilder out = new StringBuilder("1 ");

        int length = 1;
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) > S.charAt(i - 1))
                length++;
            else
                length = 1;
            out.append(String.valueOf(length)).append(" ");
        }

        return out.toString().trim();
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
