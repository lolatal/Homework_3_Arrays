import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        int[] array = {34, 12, 345, 4, 6, 9, 11, 12, 88};
        System.out.println("The array is: " + Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое число");
        int searchNumber = scanner.nextInt();

        boolean isNumberInTheArray = false;
        for(int i = 0; i < array.length; i++){
            if(array[i]==searchNumber){
                isNumberInTheArray = true;
            }
        }
        if(isNumberInTheArray){
            System.out.println("Данное число входит в массив");
        }else {
            System.out.println("Данного числа в массиве нет");
        }
    }
}
