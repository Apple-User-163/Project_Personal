import java.util.Scanner;

public class Project_29
{
    public static void main (String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int N = inpt.nextInt();
        System.out.println("Enter the names of the students: ");
        String[] name = new String[N];
        for (int i = 0; i < N; i++)
        {
            name[i] = inpt.next();
        }
        System.out.println("Enter the total marks of the students: ");
        int[] totalmarks = new int[N];
        for (int i = 0; i < N; i++)
        {
            totalmarks[i] = inpt.nextInt();
        }

        double average = 0;
        double deviation;
        for (int i = 0; i < N; i++)
        {
            average += totalmarks[i];
        }
        average /= N;
        System.out.println("The average of the total marks is " + average);

        for (int i = 0; i < N; i++)
        {
            deviation = totalmarks[i] - average;
            System.out.println("The deviation of " + name[i] + "'s marks from the average is " + deviation );
        }
    }
}