import java.util.Scanner;

public class Project_4
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = inpt.nextInt();

        boolean flag = true;
        int digit, new_num;
        new_num = 0;
        int temp = num;
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0 && num != i) {
                flag = false;
                break;
            }
        }
        while (temp != 0)
        {
            digit = temp % 10;
            temp /= 10;
            new_num = (new_num * 10) + digit;
        }
        for (int i = 2; i < new_num; i++)
        {
            if (new_num % i == 0 && new_num != i) {
                flag = false;
                break;
            }
        }

        if (flag)
        {
            System.out.println("The number is a twisted prime number");
        }
        else
        {
            System.out.println("The number is not a twisted prime number");
        }
    }
}