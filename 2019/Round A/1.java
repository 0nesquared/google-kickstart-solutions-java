import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_2019_1 {

    public static String solve(Scanner sc)
    {
        int N = sc.nextInt();
        int P = sc.nextInt();
        // we need to pick P students out of N

        Integer[] S = new Integer[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }

        int minHours = Integer.MAX_VALUE;

        // Sorting the array in descending order to isolate N-P+1 total teams possible
        // with their N-P+1 corresponding max skill values, to which the remaining
        // players will be needed to be brought to with coaching
        Arrays.sort(S, Collections.reverseOrder());

        // Forming the prefix array to calculate the coaching hours for a team starting at index i faster
        int[] PS = new int[N]; // prefix array
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += S[i];
            PS[i] = sum;
        }

        // Iterating from i = 0 to N - P
        // Calculating the min-hours needed for each team and updating our result
        for (int i = 0; i < N - P + 1; i++) {
            minHours = Math.min(minHours, P * S[i] - (PS[i + P - 1] - PS[i] + S[i]));
        }

        return String.valueOf(minHours);
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
