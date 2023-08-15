import java.util.Scanner;
public class Project_1
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = inpt.nextInt();

        int digit;
        int temp = num;
        long prt;
        long sum = 0;

        while (temp != 0)
        {
            digit = temp % 10;
            temp /= 10;
            prt = 1;
            for (int j = 1; j <= digit; j++)
            {
                prt *= j;
            }
            sum += prt;
        }
        if (sum == num)
        {
            System.out.println("The number is a special number");
        }
        else
        {
            System.out.println("The number is not a special number");
        }
    }
}