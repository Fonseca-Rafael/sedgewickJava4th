/*
 * a- (1 + 2.236)/2     = 1.618 (double)
 * b- 1 + 2 + 3 + 4.0   = 10.0 (double)
 * c- 4.1 >= 4          = True (bool)
 * d- 1 + 2 + "3"       = "33" (String)
 */

import java.io.*;

public class e1_1_02
{
    public static void main(String args[])
    {
        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1+2+"3");
    }
}
