import java.util.Scanner;

public class Project_24 {
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        int[] M = new int[6];
        int[] N = new int[4];
        int[] P = new int[N.length + M.length];
        boolean m = true;

        for (int i = 0; i < M.length + N.length; i++)
        {
            if (i < M.length)
            {
                if (m)
                {
                    System.out.println("Enter the values for array M");
                    m = false;
                }
                M[i] = inpt.nextInt();
            }
            else
            {
                if (i == M.length)
                {
                    m = true;
                }
                if (m)
                {
                    System.out.println("Enter the values for array N");
                    m = false;
                }
                N[i - M.length] = inpt.nextInt();
            }
        }

        for (int i = 0; i < P.length; i++)
        {
            if (i < M.length)
            {
                P[i] = M[i];
            }
            else
            {
                P[i] = N[i - M.length];
            }
        }
        System.out.println("The values of array P are:");
        for (int i = 0; i < P.length; i++)
        {
            if (i == P.length - 1)
            {
                System.out.print(P[i]);
            }
            else
            {
                System.out.print(P[i] + ", ");
            }
        }
    }
}