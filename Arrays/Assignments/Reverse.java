
import java.util.Arrays;
import java.util.Collections;

public class Reverse{
    public static void main(String[] args) {
        Boolean[] arr = {true,false,false,true,false,true};

        Collections.reverse(Arrays.asList(arr));

        System.out.println(Arrays.toString(arr));  //[true, false, true, false, false, true]
    }
}