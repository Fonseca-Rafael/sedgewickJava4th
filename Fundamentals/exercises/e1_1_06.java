/**
 * Prints the mathematical sequency sum of two previous numbers
 */

import java.io.*;

public class e1_1_06
{
    public static void main(String args[])
    {
        int f = 0;
        int g = 1;
        for(int i=0; i<=15; i++){
            System.out.println(f);
            f = f + g;
            g = f - g;
        }

        int p0 = 0;
        int p1 = 1;
        for(int i=0; i<=15; i++){
            System.out.println(p0);
            p1 = p0 + p1;
            p0 = p1 - p0;
        }
    }

}
