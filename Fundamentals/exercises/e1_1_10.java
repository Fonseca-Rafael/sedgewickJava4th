/**
 * e1_1_10.java:9: error: variable a might not have been initialized
 * a[i] = i * i;
 */

import java.io.*;

public class e1_1_10
{
    public static void main(String args[])
    {
        // original wrong statement
        //int[] a;
        // correct statement
        int[] a = new int[10];
        for(int i = 0; i<10; i++)
            a[i] = i * i;

    }

}
