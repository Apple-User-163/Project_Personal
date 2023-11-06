import java.util.Scanner;

public class Project_7
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the length of the paper roll in meters");
        int l = inpt.nextInt();
        System.out.println("Enter the amount of purchase");
        int a = inpt.nextInt();
        System.out.println("Enter the type of customer");
        System.out.println("1. Retailer (R)");
        System.out.println("2. Dealer (D)");
        char c = inpt.next().charAt(0);

        double discount = 0.0;
        switch (c)
        {
            case 'R': {
                if (l <= 10)
                {
                    discount = 8.0 / 100.0;
                }
                else if (l > 11 && l <= 20)
                {
                    discount = 10.0 / 100.0;
                }
                else if (l > 20)
                {
                    discount = 15.0 / 100.0;
                }
                break;
            }
            case 'D': {
                if (l <= 10)
                {
                    discount = 10.0 / 100.0;
                }
                else if (l > 11 && l <= 20)
                {
                    discount = 15.0 / 100.0;
                }
                else if (l > 20)
                {
                    discount = 20.0 / 100.0;
                }
                break;
            }
            default: {
                System.exit(422);
            }
        }
        double cost = a * discount;

        System.out.println("The length of the paper roll is " + l + " meters");
        System.out.println("The amount of purchase is ₹" + a);
        System.out.println("The type of customer is " + (c == 'R' ? "Retailer" : "Dealer"));
        System.out.println("The discount % is " + discount * 100 + "%");
        System.out.println("The cost to be paid is ₹" + cost);

    }
}