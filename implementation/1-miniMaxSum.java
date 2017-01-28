import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] nums = {a, b, c, d, e};
        System.out.print(getMaxSumOfFourNumbers());
        System.out.print(getMinSumOfFourNumbers());
    }

    static long getMaxSumOfFourNumbers(long[] nums){
        long totalSum = 0;
        for (long n : nums){
            totalSum += n;
        }
        long maxSumOfFour = 0;
        for (int i = 0; i < nums.length; i++){
            if((totalSum - nums[i]) > maxSumOfFour){
                maxSumOfFour = totalSum - nums[i];
            }
        }
        return maxSumOfFour;
    }

    static long getMinSumOfFourNumbers(long[] nums){
        long totalSum = 0;
        for (long n : nums){
            totalSum += n;
        }
        long minSumOfFour = totalSum;
        for (int i = 0; i < nums.length; i++){
            if((totalSum - nums[i]) < minSumOfFour){
                maxSumOfFour = totalSum - nums[i];
            }
        }
        return minSumOfFour;
    }
}
