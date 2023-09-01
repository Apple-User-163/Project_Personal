import java.util.Scanner;

public class Project_21
{
    void generate (int n)
    {
        System.out.println("The Fibonacci series is: ");
        long prev = 0;
        long curr = 1;

        for (int i = 0; i < n; i++)
        {
            if (prev == n - 1)
            {
                System.out.print(prev);
                break;
            }
            else
            {
                System.out.print(prev + ", ");
            }

            long temp = prev;
            prev = curr;
            curr = temp + curr;
        }
        System.out.println();
    }

    void generate (int i, int upper)
    {
        System.out.println("The prime numbers are: ");
        boolean flag;
        while (i < upper)
        {
            flag = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    flag = false;
                    break;
                }
            }

            if (flag && i == upper - 1)
            {
                System.out.print(i);
            }
            else if (flag)
            {
                System.out.print(i + ", ");
            }
            i += 1;
        }
    }

    public static void main(String[] args)
    {
        Project_21 obj = new Project_21();
        Scanner inpt = new Scanner (System.in);
        System.out.println("Enter the number of terms for the Fibonacci series");
        int n = inpt.nextInt();
        System.out.println("Enter the starting range for the prime numbers");
        int a = inpt.nextInt();
        System.out.println("Enter the ending range for the prime numbers");
        int b = inpt.nextInt();
        obj.generate(n);
        obj.generate(a, b);
    }
}