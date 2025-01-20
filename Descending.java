import java.util.Arrays;

public class Descending {

    public static String sortedArray(int[] array) {
    
        for (int i = 0; i < array.length - 1; i++) {
            int largest = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[largest]) {
                    largest = j;
                }
            }
            
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;
        }
        return Arrays.toString(array);
    }

    public static void main(String... args) {
        int[] num = {4, 5, 2, 1};
        System.out.println(sortedArray(num));
    }
}