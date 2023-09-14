import java.util.Scanner;

public class Project_25_DBT
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        int[] Rl_n = new int[50];
        int[] S_A = new int[50];
        int[] S_B = new int[50];
        int[] S_C = new int[50];

        int sum;
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
        System.out.println("Enter the roll number of the student for which you want to find the average of all subjects: ");
        int roll = inpt.nextInt();
        for (int i = 0; i < Rl_n.length; i++)
        {
            if (Rl_n[i] == roll)
            {
                sum = S_A[i] + S_B[i] + S_C[i];
                System.out.println("Average of all subjects = " + (sum/3));
            }
        }

        System.out.println("The roll number of students whose average is above 80: ");
        System.out.println("Roll No.\tAverage");
        for (int i = 0; i < Rl_n.length; i++)
        {
            sum = (S_A[i] + S_B[i] + S_C[i]) / 3;
            if (sum * 3 >= 240)
            {
                System.out.println(Rl_n[i] + "\t" + sum);
            }
        }

        System.out.println("The roll number of students whose average is below 80: ");
        System.out.println("Roll No.\tAverage");
        for (int i = 0; i < Rl_n.length; i++)
        {
            sum = (S_A[i] + S_B[i] + S_C[i]) / 3;
            if (sum * 3 < 240)
            {
                System.out.println(Rl_n[i] + "\t" + sum);
            }
        }
    }
}