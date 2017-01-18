import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] compareTriplets(int[] scoresA, int[] scoresB){
        int resultA = 0;
        int resultB = 0;
        for(int i = 0; i < scoresA.length; i++){
            if(scoresA[i] > scoresB[i])
                resultA++;
            if(scoresB[i] > scoresA[i])
                resultB++;
        }
        return new int[]{resultA, resultB};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = compareTriplets(new int[]{a0, a1, a2}, new int[]{b0, b1, b2});
        System.out.println(result[0] + " " + result[1]);
    }
}
