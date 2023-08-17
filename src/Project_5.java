import java.util.Scanner;

public class Project_5
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the ISBN number");
        int num = inpt.nextInt();

        int ISBN = 0;
        int digit, temp = num;
        int count = 1;
        for (; temp != 0; ++count)
        {
            digit = temp % 10;
            temp /= 10;
            ISBN += (digit * count);
        }
        if (ISBN % 11 == 0)
        {
            System.out.println("Legal ISBN");
        }
        else if (ISBN % 11 != 0 || count != 10)
        {
            System.out.println("Illegal ISBN");
        }
    }
}