import java.util.Scanner;
public class Project_31
{
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        String[] names = new String[10];
        String temp;

        System.out.println("Enter ten names");
        for (int i = 0; i < names.length; i++)
        {
            names[i] = inpt.nextLine();
        }

        for (int i = 0; i < names.length - 1; i++)
        {
            for (int j = 0; j < names.length - i - 1; j++)
            {
                if (names[j].charAt(0) > names[j + 1].charAt(0))
                {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
                else if (names[j].charAt(0) == names[j + 1].charAt(0))
                {
                    for (int k = 1; k < names[j].length(); k++)
                    {
                        if (names[j].charAt(k) > names[j + 1].charAt(k))
                        {
                            temp = names[j];
                            names[j] = names[j + 1];
                            names[j + 1] = temp;
                            break;
                        }
                        else if (names[j].charAt(k) < names[j + 1].charAt(k))
                        {
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < names.length; i++)
        {
            if(i < names.length - 1)
            {
                System.out.print(names[i] + ", ");
            }
            else
            {
                System.out.print(names[i]);
            }
        }
    }
}