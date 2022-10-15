import java.io.*;

public class e1_1_08
{
    public static void main(String args[])
    {
        // character b
        System.out.println('b');
        
        // both characters are converted to integer
        // and their decimal codes are summed (127)
        System.out.println('b'+'c');

        // character 'b' is converted to its decimal code and
        // then the sum is converted again to char (f)
        System.out.println((char) ('b' + 4));
    }

}
