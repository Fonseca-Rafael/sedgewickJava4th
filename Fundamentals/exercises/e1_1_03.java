/*
 * a- (1 + 2.236)/2     = 1.618 (double)
 * b- 1 + 2 + 3 + 4.0   = 10.0 (double)
 * c- 4.1 >= 4          = True (bool)
 * d- 1 + 2 + "3"       = "33" (String)
 */

import java.io.*;

public class e1_1_03
{
    public static void main(String args[])
    {
        int[]   values = {0,0,0};
        int     idx = 0;
        
        while(!StdIn.isEmpty()){
            values[idx] = StdIn.readInt();
            idx += 1;
            // should not try read anything after 3 values
            if(idx >= 3) break;
        }

        if(values[0] == values[1] && values[1] == values[2])
                System.out.println("equal");
        else 
            System.out.println("not equal");
    }
}
