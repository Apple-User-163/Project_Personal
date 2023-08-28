import java.util.Scanner;

public class ParkingLot
{
    int vno, hours;
    double bill;

    void input ()
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the vehicle number");
        vno = inpt.nextInt();
        System.out.println("Enter the number of hours");
        hours = inpt.nextInt();
    }
    void calculate ()
    {
        bill = 3.00;
        if (hours > 1)
        {
            bill += (hours - 1) * 1.50;
        }
    }
    void display ()
    {
        System.out.println("Vehicle number: " + vno);
        System.out.println("Number of hours: " + hours);
        System.out.println("Bill amount: ₹" + bill);
    }
    public static void main(String[] args)
    {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}