import java.io.*;

public class e1_1_05
{
    public static void main(String args[])
    {
        double x;
        double y;
        boolean r = false;

        System.out.println("Enter x value:");
        x = StdIn.readDouble();
        
        System.out.println("Enter y value:");
        y = StdIn.readDouble();

        System.out.println("x="+x+",y="+y);
        System.out.println("both values are between 0 and 1?");

        if(x >= 0 && x <=1 && y >= 0 && y <=1) r = true;

        System.out.println(r);
    }

}
