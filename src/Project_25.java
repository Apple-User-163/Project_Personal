import java.util.Scanner;

public class Project_25 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int[][] student_details = new int[2][4];
        double average_marks;
        String round;
        for (int i = 0; i < student_details.length; i++)
        {
            System.out.print("Enter roll number of student " + (i + 1) + ": ");
            student_details[i][0] = reader.nextInt();
            System.out.print("Enter marks of student in Subject A: ");
            student_details[i][1] = reader.nextInt();
            System.out.print("Enter marks of student in Subject B: ");
            student_details[i][2] = reader.nextInt();
            System.out.print("Enter marks of student in Subject C: ");
            student_details[i][3] = reader.nextInt();
            System.out.println();
        }
        System.out.println("\n\nAverage Marks Obtained by each student: ");
        for (int i = 0; i < student_details.length; i++)
        {
            average_marks = (student_details[i][1] + student_details[i][2] + student_details[i][3]) / 3.0;
            round = String.format("%.2f", average_marks);
            average_marks = Double.parseDouble(round);
            System.out.println("Student " + (i + 1) + ": " + average_marks);
        }
        System.out.println("\n\nRoll number and Average marks of students with marks greater than 80: ");
        for (int[] student_detail : student_details)
        {
            average_marks = student_detail[1] + student_detail[2] + student_detail[3] / 3.0;
            round = String.format("%.2f", average_marks);
            average_marks = Double.parseDouble(round);
            if (average_marks > 80)
            {
                System.out.println("Roll Number: " + student_detail[0] + ", Average marks: " + average_marks);
            }
        }
        System.out.println("\n\nRoll number and Average marks of students with marks below 80: ");
        for (int[] studentDetail : student_details)
        {
            average_marks = studentDetail[1] + studentDetail[2] + studentDetail[3] / 3.0;
            round = String.format("%.2f", average_marks);
            average_marks = Double.parseDouble(round);
            if (average_marks < 80)
            {
                System.out.println("Roll Number: " + studentDetail[0] + ", Average marks: " + average_marks);
            }
        }
    }
}