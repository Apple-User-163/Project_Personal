import java.util.Scanner;

public class Project_6
{
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number of hours worked this week");
        int hours = inpt.nextInt();

        int salary = 0;

        if (hours <= 48)
        {
            salary = hours * 1000;
        }
        else if (hours > 48 && hours <= 56)
        {
            salary = 48 * 1000 + (hours - 48) * 1250;
        }
        else if (hours > 56)
        {
            salary = 48 * 1000 + 8 * 1250 + (hours - 56) * 1500;
        }

        System.out.println("The weekly salary is ₹ " + salary);
    }
}