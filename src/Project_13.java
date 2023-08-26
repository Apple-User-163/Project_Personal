public class Project_13
{
    public static void main(String[] args)
    {
        char ch = 'A';
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(ch + "\t");
                ch ++;
            }
            System.out.println();
            ch = 'A';
        }
    }
}