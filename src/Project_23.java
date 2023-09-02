import java.util.Scanner;

public class Project_23
{
    double volume (double r)
    {
        return (4.0/3.0) * (22.0/7.0) * Math.pow(r, 3);
    }

    double volume (double h, double r)
    {
        return (22.0/7.0) * Math.pow(r, 2) * h;
    }
    double volume (double l, double b, double h)
    {
        return l * b * h;
    }

    public static void main(String[] args)
    {
        Scanner inpt = new Scanner (System.in);
        Project_23 obj = new Project_23();

        System.out.println("Choose the shape: ");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cuboid");
        byte choice = inpt.nextByte();

        double r, h, l, b;
        switch (choice)
        {
            case 1:
                System.out.println("Enter the radius of the sphere: ");
                r = inpt.nextDouble();
                System.out.println("Volume of the sphere = " + obj.volume(r));
                break;
            case 2:
                System.out.println("Enter the radius and height of the cylinder: ");
                r = inpt.nextDouble();
                h = inpt.nextDouble();
                System.out.println("Volume of the cylinder = " + obj.volume(h, r));
                break;
            case 3:
                System.out.println("Enter the length, breadth and height of the cuboid: ");
                l = inpt.nextDouble();
                b = inpt.nextDouble();
                h = inpt.nextDouble();
                System.out.println("Volume of the cuboid = " + obj.volume(l, b, h));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}