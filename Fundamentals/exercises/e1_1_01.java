/*
 * a- (0+15)/2                      = 7
 * b- (2.0e-6) * 100000000.1        = 200.0000002
 * c- true && false || true && true = true
 */

import java.io.*;

public class e1_1_01
{
    public static void main(String args[])
    {
        System.out.println((0+15)/2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }
}
