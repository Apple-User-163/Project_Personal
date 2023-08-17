import java.util.Scanner;
public class Project_3
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = inpt.nextInt();

        int digit;
        int temp = num;
        int sum = 0;
        boolean flag = false;
        while (temp != 0)
        {
            digit = temp % 10;
            temp /= 10;
            sum += digit;
            if (sum == 1)
            {
                flag = true;
                break;
            }
            else if (sum <= 9 && temp == 0)
            {
                break;

            }
            if (temp == 0)
            {
                temp = sum;
                sum = 0;
            }

        }
        if (flag)
        {
            System.out.println("The number is a magic number");
        }
        else
        {
            System.out.println("The number is not a magic number");
        }
    }
}