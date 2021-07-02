import java.util.*;

/* NOTE - The code is giving TLE in the 2nd Test set on the Google Platform.
Extra time could be due to the auto-boxing/un-boxing between ints and Integers
or some other Java features, Idk. If someone finds out a bug or a missing test
case in the code, please do submit a pull request :)
* */

public class F_2020_1
{
    public static String solve(Scanner sc)
    {
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];

        Integer[] I = new Integer[N]; // to store the indices

        for (int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
            // directly adding the number of times a person will withdraw from the ATM
            A[i] = (int) Math.ceil((float)A[i] / X);

            I[i] = i + 1;
        }

        // Now all we have to do is sort the array's indices according to the A[i]
        // We will use an anonymous comparator to accomplish our goal here
        Arrays.sort(I, new Comparator<Integer>() {
           public int compare(Integer i1, Integer i2) {
                int a = i1;
                int b = i2;

                // We will sort according to the values at indices a - 1 and b - 1 in array A
                if (A[a - 1] < A[b - 1])
                    return -1;
                else if (A[a - 1] > A [b - 1])
                    return 1;
                return 0;
           }
        });

        String result = "";

        for (int i : I)
            result += String.valueOf(i) + " ";


        return result.trim();
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