import java.util.Scanner;

public class Project_32
{
    static String[] wonder = new String[7];
    static String[] location = new String[7];
    Project_32()
    {
        wonder[0] = "Taj Mahal";
        wonder[1] = "Great Wall of China";
        wonder[2] = "Petra";
        wonder[3] = "Machu Picchu";
        wonder[4] = "Chichen Itza";
        wonder[5] = "Christ the Redeemer";
        wonder[6] = "Colosseum";

        location[0] = "India";
        location[1] = "China";
        location[2] = "Jordan";
        location[3] = "Peru";
        location[4] = "Mexico";
        location[5] = "Brazil";
        location[6] = "Italy";
    }
    public static void main(String[] args)
    {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the country name: ");
        String country = inpt.nextLine();
        new Project_32();
        boolean flag = false;
        for (int i = 0; i < 7; i++)
        {
            if (country.equalsIgnoreCase(location[i]))
            {
                System.out.println(wonder[i] + " is located in " + location[i]);
                flag = true;
            }
        }
        if (!flag)
        {
            System.out.println("Sorry Not Found!");
        }
    }
}