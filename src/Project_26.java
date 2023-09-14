import java.util.Scanner;

public class Project_26
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        double[] arr = new double[15];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = inpt.nextDouble();
        }

        double largest = 0, smallest = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (i == 0)
            {
                largest = arr[i];
                smallest = arr[i];
            }
            else
            {
                if (arr[i] > largest)
                {
                    largest = arr[i];
                }
                if (arr[i] < smallest)
                {
                    smallest = arr[i];
                }
            }
        }
        double range = largest - smallest;
        System.out.println("The range for the entered values is " + String.format("%.2f", range));
    }
}