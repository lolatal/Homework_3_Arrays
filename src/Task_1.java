import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] myArray = {33, 15, 21, 8, 95, 10, 13, 1, 84, 50, 15};
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(myArray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое число");
        int searchNumber = scanner.nextInt();
        boolean isNumberInTheArray = false;
        for (int item : myArray) {
            if (item == searchNumber) {
                isNumberInTheArray = true;
            }
        }
        if(isNumberInTheArray){
            System.out.println("Искомое число будет удалено из массива");
        }else{
            System.out.println("Искомого числа в массиве нет. Новый массив будет без изменений");
        }
        System.out.println("New Array: ");
        System.out.println(Arrays.toString(remove(myArray, searchNumber)));

    }
    public static int[] remove (int[] myArray, int searchNumber){
        int counter=0;
        for (int i = 0; i < myArray.length; i++){
            if(myArray[i]==searchNumber){
                counter++;
            } else{
                myArray[i-counter]=myArray[i];
            }
        }
        return Arrays.copyOf(myArray, myArray.length-counter);
    }

}

