public class Project_24_DBT {
    public static void main(String[] args)
    {
        int[] M = {10, 20, 30, 40, 50, 60, 70};
        int[] N = {60, 80, 90, 95, 100};
        int[] P = new int[N.length + M.length];

        for (int i = 0; i < M.length + N.length; i++)
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

        for (int i = 0; i < P.length; i++)
        {
            for (int j = i + 1; j < P.length; j++) {
                if (P[i] > P[j])
                {
                    int temp = P[i];
                    P[i] = P[j];
                    P[j] = temp;
                }
            }
        }

        for (int i = 0; i < P.length; i++)
        {
            for (int j = i + 1; j < P.length; j++) {
                if (P[i] == P[j]) {
                    P[j] = 0;
                }
            }
        }

        for (int i = 0; i < P.length; i++)
        {
            for (int j = i + 1; j < P.length; j++)
            {
                if (P[i] == 0)
                {
                    int temp = P[i];
                    P[i] = P[j];
                    P[j] = temp;
                }
            }
        }

        for (int i = 0; i < P.length; i++)
        {
            if (i == P.length - 1)
            {
                System.out.print(P[i] + "\n");
            }
            else
            {
                System.out.print(P[i] + ", ");
            }
        }
    }
}