import java.io.*;

public class e1_1_14
{
    static int lg(int N)
    {   int ret = 0;
        
        while((N >>= 1) > 0) ret++;
        
        return ret;

    }

    public static void main(String args[])
    {
        int res;
        int val;

        System.out.println("Digit a positive integer value:");
        val = StdIn.readInt();

        res = lg(val);

        System.out.println("log of " + val + " base 2 = " + res);
    }

}
