import java.io.*;
import java.lang.Math;

public class e1_1_09
{
    // conscise solution
    static void convertToBinartyString(int N)
    {
        String s = "";
        for(int n = N; n>0; n/=2){
            s = (n%2) + s;
        }
        System.out.printf("%d=%s\n",N, s);
    }

    // human sequencial solution
    static void convertToBinaryFixedSize(int N)
    {
        int tmp = N;
        String s = "";
        for(int n = 7; n>=0; n--){
            int a = (int) (tmp / Math.pow(2,n));
            if(a > 0){
                tmp = tmp - (int)Math.pow(2,n);
                s = s + 1;
            }else{
                s = s + 0;
            }
        }
        System.out.printf("%d=%s\n",N, s);

    }

    // bit shift solution
    static void convertToBinaryBitShift(int N)
    {
        int tmp = N;
        String s = "";
        while(N > 0){
            s = (N & 1) + s;
            N >>= 1;
        }
        System.out.printf("%d=%s\n",tmp, s);
    }

    public static void main(String args[])
    {

        convertToBinartyString(10);
        convertToBinartyString(7);
        convertToBinartyString(3);
        convertToBinartyString(211);
       
        convertToBinaryFixedSize(10);
        convertToBinaryFixedSize(7);
        convertToBinaryFixedSize(3);
        convertToBinaryFixedSize(211);

        convertToBinaryBitShift(10);
        convertToBinaryBitShift(7);
        convertToBinaryBitShift(3);
        convertToBinaryBitShift(211);

    }

}
