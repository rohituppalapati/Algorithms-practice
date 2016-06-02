package codewars;

/**
 * Created by rohituppalapati on 6/2/16.
 */
public class CalculateRotation {
    static int shiftedDiff(String first, String second){
        if(first.length() != second.length()) return -1;
        second += second;
        return second.indexOf(first);
    }
}