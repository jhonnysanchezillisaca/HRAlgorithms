import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            char[] spaces = new char[n-i];
            char[] chars = new char[i];
            Arrays.fill(spaces, " ");
            Arrays.fill(chars, "#");
            System.out.println(spaces, chars);
        }
    }
}
