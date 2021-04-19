import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int [] array1 = {34, 56, -6, 13, 88};
        int [] array2 = {11, 113, 65, 1, 4};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int sum1 = 0;
        int sum2 = 0;
        for (int item1 : array1) {
            sum1 += item1;
        }
        for (int item2 : array2) {
            sum2 += item2;
        }
        double average1 = (double)sum1/5;
        double average2 = (double)sum2/5;
        System.out.println("Среднее арифметическое первого массива = " + average1);
        System.out.println("Среднее арифметическое второго массива = " + average2);

        if (average1 > average2){
            System.out.println("Среднее ариметическое первого массива больше среднего арифметического второго массива");
        }else if (average2 > average1){
            System.out.println("Среднее ариметическое второго массива больше среднего арифметического первого массива");
        }else {
            System.out.println("Средние арифметические двух массивов равны");
        }
    }
}
