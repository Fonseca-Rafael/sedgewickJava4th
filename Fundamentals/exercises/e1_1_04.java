/**
 * if (a > b) then c = 0;
 * if a > b { c = 0; }
 * if (a > b) c = 0;
 * if (a > b) c = 0 else b = 0;
 */

import java.io.*;

public class e1_1_04
{
    public static void main(String args[])
    {
        int a=10, b=20, c=30;
        System.out.println("syntax check");

        /** 
         * there is no then keyword
         */
        //if (a>b) then c = 0;
        
        /** 
         * missing ( ) 
         */
        //if a > b { c = 0;}
        
        /**
         * this is an ok syntax
         */
        if(a > b) c = 0;
        
        /**
         * missing ;
         */
        //if(a > b) c = 0 else b = 0;
    }
}
