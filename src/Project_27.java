import java.util.Scanner;

public class Project_27
{
    public static void main(String[] args)
    {
        int [] arry = new int[10];
        Scanner inpt = new Scanner(System.in);

        System.out.println("Enter 10 integers");
        for (int i = 0; i < arry.length; i++)
        {
            arry[i] = inpt.nextInt();
        }
        System.out.println("Enter a number to be searched");
        int num = inpt.nextInt();

        int pos = 0;
        boolean found = false;
        for (int i = 0; pos < arry.length; pos++)
        {
            if (arry[i] == num)
            {
                found = true;
                pos = i;
                break;
            }
        }

        System.out.println("The array is: ");
        for (int i = 0; i < arry.length; i++)
        {
            System.out.println(arry[i] + ", ");
        }
        if (found)
        {
            System.out.println("Search successful");
            System.out.println("The number " + num + " is found at position " + pos);
        }
        else
        {
            System.out.println("Not found in the list, search unsuccessful");
            System.out.println("The number " + num + " is not found in the list");
        }
    }
}