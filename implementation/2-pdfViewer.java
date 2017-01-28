import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int wordWidth = word.length();
        char[] c = word.toCharArray();
        int maxHeight = 0;
        for (char letter : c) {
            int height = h[getIndexOfLetterInAlphabet(letter) - 1];
            if(height > maxHeight){
                maxHeight = height;
            }
        }
        System.out.println(maxHeight * wordWidth);
    }

    static int getIndexOfLetterInAlphabet(char letter){
    int charVal = (int)letter;
    int baseValue = 96;  // for lower case
    if(charVal <= 122 & charVal >= 97){
        return charVal - baseValue;
        }
    return -1;
    }
}
