import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double numPositives = 0, numNegatives = 0, numZeros = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] < 0)
                numNegatives++;
            else if(arr[arr_i] > 0)
                numPositives++;
            else
                numZeros++;
        }
        System.out.println(numPositives/n);
        System.out.println(numNegatives/n);
        System.out.println(numZeros/n);
    }
}
