import java.util.Scanner;

public class Project_11
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the limit of the series: ");
        int n = inpt.nextInt();
        System.out.println("Enter the value of x: ");
        double x = inpt.nextDouble();

        double s = 0;
        double multi = 1;
        int count = 0;
        boolean flag = false;

        System.out.print("The value of the first series is: ");

        for (int i = 1; i <= n; i++)
        {
            multi *= i;
            if (i % 2 == 0)
                s -= (x / multi);
            else
                s += (x / multi);
        }
        System.out.println(s);

        s = 0;
        for (int i = 1; count < n; i++)
        {
            for (int j = 2; j <= i; j++)
            {
                if (i % j == 0 && i != j)
                {
                    flag = false;
                    break;
                }
                else
                {
                    flag = true;
                }

            }
            if (flag)
            {
                count ++;
                s += i / Math.pow(x, count);
                System.out.println(s);
            }
        }
        System.out.println("The value of the second series is: " + s);
    }
}