import java.util.Scanner;
public class Project_2
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = inpt.nextInt();
        boolean flag = false;

        int i = 2;
        for (; i < num; i++)
        {
            if (num % i == 0 && num != i && !flag)
            {
                System.out.println("The number is a composite number");
                flag = true;
            }
        }
        if (num <= i && !flag)
        {
            System.out.println("The number is not a composite number");
        }
    }
}