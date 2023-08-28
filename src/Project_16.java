import java.util.Scanner;

public class Project_16
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter choose your program");
        System.out.println("1. Generating letters from A to Z along with their unicode values");
        System.out.println("2. Generating a series");
        byte choice = inpt.nextByte();

        switch (choice)
        {
            case 1:
            {
                System.out.println("Letters Unicode");
                for (int i = 65; i <= 90; i++)
                {
                    System.out.println((char) i + " - " + i);
                }
                break;
            }
            case 2:
            {
                for (int i = 1; i <= 5; i++)
                {
                    for (int j = 1; j <= i; j++)
                    {
                        System.out.print(j + "\t");
                    }
                    System.out.println();
                }
            }
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}