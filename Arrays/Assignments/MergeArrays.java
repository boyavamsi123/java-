
import java.util.Arrays;

public class MergeArrays{
    public static void main(String[] args) {
        String[] array1 = {"chai","coffee"};
        String[] array2 = {"milk","water","coke"};

        String[] mergedArray = new String[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        System.out.println(Arrays.toString(mergedArray));
    }
}