import java.util.Scanner;

public class Project_22
{
    void series (int x, int n)
    {
        double sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += Math.pow(x, i);
        }
        System.out.println("Sum of the series = " + sum);
    }

    void series (int p)
    {
        double prt;
        System.out.println("Series: ");
        for (int i = 1; i <= p; i++)
        {
            prt = Math.pow (i, 3) - 1;
            String prtStr = String.valueOf(prt);
            prtStr = prtStr.replace(".0", "");

            if (i == p)
            {
                System.out.print(prtStr + "\n");
            }
            else
            {
                System.out.print(prtStr + ", ");
            }
        }
    }

    void series()
    {
        double sum = 0;
        for (int i = 2; i <= 10; i++)
        {
            sum += 1/(double)i;
        }
        System.out.println("Sum of the series = " + sum);
    }

    public static void main(String[] args)
    {
        Project_22 obj = new Project_22();
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the value of x and n: ");
        int x = inpt.nextInt();
        int n = inpt.nextInt();
        System.out.println("Enter the value of p: ");
        int p = inpt.nextInt();

        obj.series(x, n);
        obj.series(p);
        obj.series();
    }
}