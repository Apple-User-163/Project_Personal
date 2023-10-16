import java.util.Scanner;

public class Project_25_DBT
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        int[] Rl_n = new int[3];
        int[] S_A = new int[3];
        int[] S_B = new int[3];
        int[] S_C = new int[3];

        int average;
        System.out.println("Enter the roll numbers of the students: ");
        for (int i = 0; i < Rl_n.length; i++)
        {
            Rl_n[i] = inpt.nextInt();
        }
        System.out.println("Enter the marks of the students in subject A: ");
        for (int i = 0; i < S_A.length; i++)
        {
            S_A[i] = inpt.nextInt();
        }
        System.out.println("Enter the marks of the students in subject B: ");
        for (int i = 0; i < S_B.length; i++)
        {
            S_B[i] = inpt.nextInt();
        }
        System.out.println("Enter the marks of the students in subject C: ");
        for (int i = 0; i < S_C.length; i++)
        {
            S_C[i] = inpt.nextInt();
        }

        for (int i = 0; i < Rl_n.length; i++)
        {
            average = (S_A[i] + S_B[i] + S_C[i]) / 3;
            System.out.println("The average of student " + Rl_n[i] + " is " + average);
        }

        for (int i = 0; i < Rl_n.length; i++)
        {
            if (S_A[i] > 80 && S_B[i] > 80 && S_C[i] > 80)
            {
                System.out.println("\nThe roll number and average marks of students whose marks is above 80: ");
                System.out.println("Roll No.\tAverage");
                average = (S_A[i] + S_B[i] + S_C[i]) / 3;
                System.out.println(Rl_n[i] + "\t" + average);
            }
            else
            {
                System.out.println("No student has marks above 80");
            }
        }

        for (int i =0; i < Rl_n.length; i++)
        {
            if (S_A[i] < 80 && S_B[i] < 80 && S_C[i] < 80)
            {
                System.out.println("\nThe roll number and average marks of students whose marks is below 80: ");
                System.out.println("Roll No.\tAverage");
                average = (S_A[i] + S_B[i] + S_C[i]) / 3;
                System.out.println(Rl_n[i] + "\t" + average);
            }
            else
            {
                System.out.println("No student has marks below 80");
            }
        }
    }
}