import java.util.Arrays;

public class Unique {

    public static Arrays uniqueNumber(int[] array) {
    
      for (int i = 0; i < array.length; i++) {
            
         for (int j = i + 1; j < array.length; j++) {
            if (array[i] != array[j]) {
                return [i];
                
        }
     
    }

    public static void main(String... args) {
        int[] num = {4, 5, 2, 1};
        System.out.println(sortedArray(num));
    }
}