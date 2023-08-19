import java.util.Scanner;

public class Project_6
{
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number of hours worked this week");
        int hours = inpt.nextInt();

        int salary;
        int rate = 0;

        if (hours <= 48)
        {
            rate = 1000;
        }
        else if (hours > 48 && hours <= 56)
        {
            rate = 1250;
        }
        else if (hours > 56)
        {
            rate = 1500;
        }
        salary = hours * rate;

        System.out.println("The weekly salary is ₹ " + salary);
    }
}