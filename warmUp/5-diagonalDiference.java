import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int inverseDiagonal = n - 1;
        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j)
                    sumPrimaryDiagonal += a[a_i][a_j];
                if(a_j == inverseDiagonal){
                    inverseDiagonal--;
                    sumSecondaryDiagonal += a[a_i][a_j];
                }
            }
        }
        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }
}
