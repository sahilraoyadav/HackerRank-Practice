import java.util.Arrays;
import java.util.Collection;

public class ArrayDS {
    public static void main(String[] args) {
        //Intializes the start array
        int[] test = { 1, 2, 3 };
        //Intializes null arrays to start with
        int[] sTest = new int[test.length];
        int[] aTest = new int[test.length];
        //intializes vars to start with
        int start = 0;
        int counter = test.length - 1;
        //Using While loop
        while (counter >= 0) {
            aTest[start] = test[counter];
            start++;
            counter--;
        }
        //Using for loop
        for (int i = 0; i < test.length; ++i) {
            sTest[i] = test[test.length - i - 1];
        }
        //Prints out the Array
        System.out.println(Arrays.toString(aTest));
        System.out.println(Arrays.toString(sTest));
    }
}