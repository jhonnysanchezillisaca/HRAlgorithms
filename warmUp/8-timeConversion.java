import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        CharSequence am = "AM";
        CharSequence pm = "PM";
        String result = "";
        if(time.contains(am)){
            String timeString = time.replace(am, "");
            String[] hhmmss = timeString.split(":");
            int hours = Integer.parseInt(hhmmss[0]);
            hours = (hours == 12) ? (hours=0) : hours;
            hhmmss[0] = (hours!=0) ? Integer.toString(hours) : "00";
            result = String.join(":", hhmmss);

        }
        else if (time.contains(pm)) {
            String timeString = time.replace(pm, "");
            String[] hhmmss = timeString.split(":");
            int hours = Integer.parseInt(hhmmss[0]);
            hours = (hours == 12) ? (hours=0) : (hours+=12);
            hhmmss[0] = (hours!=0) ? Integer.toString(hours) : "00";
            result = String.join(":", hhmmss);
        }
        System.out.println(result);
    }
}
