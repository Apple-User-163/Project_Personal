import java.util.Scanner;
public class Project_1
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = inpt.nextInt();

        int digit = 0;
        int temp = num;

        for (int i = 0; i < 3; i++)
        {
            digit = temp % 10;
            temp = temp / 10;
            System.out.println(digit);
        }
    }
}