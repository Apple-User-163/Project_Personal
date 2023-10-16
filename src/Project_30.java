import java.util.*;
public class Project_30
{
    public static void main (String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        int[] arr = new int[10];
        int temp;

        System.out.println("Enter ten integers: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = inpt.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr.length; i++)
        {
            if(i < arr.length - 1)
            {
                System.out.print(arr[i] + ", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
    }
}