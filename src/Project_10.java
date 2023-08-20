import java.util.Scanner;

public class Project_10
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = inpt.nextInt();
        System.out.println("Choose an operation: ");
        System.out.println("1. Print the series 1, 12, 123, 1234, ... to n terms");
        System.out.println("2. Print the sum of the series 1 + (1+2 / 1*2) + (1+2+3 / 1*2*3) + ... to (1+2+3...+n / 1*2*3...*n)");
        byte choice = inpt.nextByte();


        double sum = 0;
        long add = 0;
        long multi = 1;
        double prt;
        switch (choice)
        {
            case 1:
                System.out.println("The series is: ");
                for (int i = 1; i <= n; i++)
                {
                    sum = sum * 10 + i;
                    if (i < n)
                        System.out.print(sum + ", ");
                    else
                        System.out.println(sum);
                }
                break;
            case 2:
                System.out.println("The sum of the series is: ");
                for (int i = 1; i <= n; i++)
                {
                    add += i;
                    multi *= i;
                    prt = (double) add / multi;
                    sum += prt;
                }
                System.out.println(sum);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}