import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {5, 7, 13, 2, 43, 67, 112, 1, 2, 95};
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(array));
        System.out.println("New Array");
        for (int i=0; i< array.length; i++){
            if (i%2!=0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
