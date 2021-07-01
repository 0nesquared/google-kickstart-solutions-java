import java.util.Scanner;

public class G_2020_1 {
    public static String solve(Scanner sc)
    {
        String S = sc.next();
        int count = 0;

        int firstKick = S.indexOf("KICK");
        int lastStart = S.lastIndexOf("START");

        if (firstKick > lastStart)
            return String.valueOf(0);

        int kickCounter = 0;
        for (int i = 0; i < S.length(); i++)
        {
            if (S.charAt(i) == 'K' && i + 1 < S.length() && S.charAt(i + 1) == 'I' && i + 2 < S.length() && S.charAt(i + 2) == 'C' && i + 3 < S.length() && S.charAt(i + 3) == 'K')
            {
                i += 2;
                kickCounter++;
            }
            else if (S.charAt(i) == 'S' && i + 1 < S.length() && S.charAt(i + 1) == 'T' && i + 2 < S.length() && S.charAt(i + 2) == 'A' && i + 3 < S.length() && S.charAt(i + 3) == 'R' && i + 4 < S.length() && S.charAt(i + 4) == 'T')
            {
                i += 4;
                count += kickCounter;
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