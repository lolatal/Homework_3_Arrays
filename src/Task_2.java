import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int arraySize = scanner.nextInt();

        double[] array = new double [arraySize];
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        double maxValue = array[arraySize - 1];
        double minValue = array[0];
        System.out.println("Максимальный элемент в массиве  = " + maxValue);
        System.out.println("Минимальный элемент в массиве = " + minValue);

        double sum = 0;
        double average;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = sum/arraySize;
        System.out.println("Среднее арифметическое массива = " + average);
    }
}
