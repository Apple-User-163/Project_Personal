public class Project_14
{
    public static void main(String[] args)
    {
        for (int i = 5; i > 0; i--)
        {
            for (int j = 0; j < 5 - i; j++)
            {
                System.out.print("\t");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}