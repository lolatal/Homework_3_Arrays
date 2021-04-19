import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] array = {34, 67, 2, 0, 87, 42, 99, 113, 14};
        System.out.println("Initial Array: ");
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("New Array: ");
        System.out.println(Arrays.toString(array));

    }
}
