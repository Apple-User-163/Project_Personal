public class Project_9
{
    public static void main(String[] args)
    {


        int strt = 1;
        int count = 0;
        int i = 3;
        int add = 75;
        boolean flag;


        // Series 1
        System.out.println("Series 1");
        while (count < 10)
        {

            flag = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag && count <= 8)
            {
                System.out.print(strt + ", ");
                strt += i;
                count ++;
            }
            else if (flag)
            {
                System.out.println(strt);
                strt += i;
                count ++;
            }
            i += 1;
        }


        // Series 2
        count = 0;
        strt = 1;
        System.out.println("\nSeries 2");
        for (int j = 1; j <= 10; j++)
        {
            if (count < 9)
            {
                System.out.print(strt + ", ");
            }
            else
            {
                System.out.println(strt);
            }
            strt += j;
            count ++;
        }


        // Series 3
        System.out.println("\nSeries 3");
        for (int j = 1; j <= 10; j++)
        {
            double val = Math.pow(j, 3) - 1;
            String valStr = String.valueOf(val);
            valStr = valStr.replace(".0", "");
            if (j <= 9)
                System.out.print(valStr + ", ");
            else
                System.out.println(valStr);
        }


        // Series 4
        strt = 24;
        System.out.println("\nSeries 4");
        for (int j = 1; j <= 10; j++)
        {
            if (j <= 9)
            {
                System.out.print(strt + ", ");
            }
            else
            {
                System.out.print(strt);
            }
            strt += add;
            add += 50;
        }
    }
}