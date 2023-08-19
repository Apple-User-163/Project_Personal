import java.util.Scanner;

public class Project_8
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Choose what type of investment you want to make:");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        byte choice = inpt.nextByte();
        switch (choice)
        {
            case 1 : {
                System.out.println("Enter the amount you want to invest:");
                double P = inpt.nextDouble();
                System.out.println("Enter the rate of interest:");
                double r = inpt.nextDouble();
                System.out.println("Enter the time period (in years):");
                double n = inpt.nextDouble();
                double A = P * Math.pow ((1 + (r / 100)), n ) ;

                System.out.println("The amount you will get at the time of maturity is ₹ " + A);
                break;
            }
            case 2 : {
                System.out.println("Enter the amount you want to invest:");
                double P = inpt.nextDouble();
                System.out.println("Enter the rate of interest:");
                double r = inpt.nextDouble();
                System.out.println("Enter the time period (in months):");
                double n = inpt.nextDouble();
                double prt_1 = (n * (n + 1)) / 2.0;
                double inter = P * prt_1 * (r / 100) * (1.0/12.0);
                double A = (P * n) + inter;
                System.out.println("The amount you will get at the time of maturity is ₹ " + A);
                break;
            }
            default: {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}