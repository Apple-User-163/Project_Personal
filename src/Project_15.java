import java.util.Scanner;

public class Project_15
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Choose a pattern");
        System.out.println("1. Pattern 1");
        System.out.println("2. Pattern 2");
        byte choice = inpt.nextByte();
        int countr = 1;

        switch(choice)
        {
            case 1:
            {
                for (int i = 1; i <= 5; i++)
                {
                    for (int j = 1; j <= i; j++)
                    {
                        if (j % 2 == 0)
                            System.out.print("*\t");
                        else
                            System.out.print("#\t");
                    }
                    System.out.println();
                }
                break;
            }
            case 2:
            {
                for (int i = 5; i > 0; i--)
                {
                    for (int j = 0; j < i; j++)
                    {
                        System.out.print(countr + "\t");
                        countr++;
                    }
                    System.out.println();
                }
                break;
            }
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}