import java.io.*;
import java.util.Random;

public class e1_1_11
{
    static void setup(boolean[][] A, int row, int col)
    {

        Random rand = new Random();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(rand.nextInt(2) == 1){
                    A[i][j] = true;
                }else{
                    A[i][j] = false;
                }
            }
        }
    }

    static void print(boolean[][] A, int row, int col)
    {
        System.out.printf("two-dimensional array: %d,%d\n", row, col);
        for(int i=0; i<row; i++){
            System.out.printf("[");
            for(int j=0; j<col; j++){
                if(A[i][j]){
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("]\n");
        }
    }

    public static void main(String args[])
    {
        int     row = 10;
        int     col = 10;
        boolean A[][] = new boolean[row][col];

        setup(A, row, col);
        print(A, row, col);

    }

}
