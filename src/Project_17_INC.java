import java.util.Scanner;

public class Project_17_INC
{
    String n;
    int units;
    double bill;
    void accept ()
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter your name");
        n = inpt.nextLine();
        System.out.println("Enter the number of units consumed");
        units = inpt.nextInt();
    }
    void calculate()
    {
        if (units <= 100)
            bill = units * 2.00;
        else if (units <= 300)
            bill = 100 * 2.00 + (units - 100) * 3.00;
        else if (units <= 600)
        {
            bill = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;
            bill += bill * 2.5 / 100;
        }

    }
    void print ()
    {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: ₹" + bill);
    }
    public static void main(String[] args)
    {
        Project_17_INC obj = new Project_17_INC();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}