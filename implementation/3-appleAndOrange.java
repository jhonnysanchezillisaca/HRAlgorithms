import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];

        int resultApples = 0;
        int resultOranges = 0;

        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if ((apple[apple_i] + appleTree) >= s && (apple[apple_i] + appleTree) <= t) {
                resultApples++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if ((orange[orange_i] + orangeTree) >= s && (orange[orange_i] + orangeTree) <= t) {
                resultOranges++;
            }
        }
        System.out.println(resultApples);
        System.out.println(resultOranges);
    }
}
