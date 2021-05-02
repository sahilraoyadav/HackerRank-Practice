import java.util.Arrays;
import java.util.Collection;
public class ArrayDS{
    public static void main(String[] args) {
        int[] test = {1,2,3};
        int [] sTest = new int[test.length];

        for(int i = 0; i < test.length; ++i){
            sTest[i] = test[test.length-i-1];
        }
        System.out.println(Arrays.toString(sTest));   
    }
}