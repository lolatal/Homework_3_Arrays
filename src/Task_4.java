import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число (размер вашего массива)");
        Scanner scanner = new Scanner(System.in);
        int n;
        int evenCounter = 0;
        if (scanner.hasNextInt()) {
            do {
                n = scanner.nextInt();
                if (n <= 5 || n > 10) {
                    System.out.println("Вы ввели неподходящее число, попробуйте еще раз");
                }
            }
            while (n <=5 || n > 10);
            int[] array1 = new int[n];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = (int) (Math.random() * 100);
                if(array1[i]%2==0 && array1[i]!=0){
                    evenCounter++;
                }
            }
            System.out.println(Arrays.toString(array1));
            System.out.println("Новый массив четных элементов: ");
            if (evenCounter > 0) {
                int[] array2 = new int[evenCounter];
                for(int i=0, j=0; i< array1.length; i++) {
                    if (array1[i]%2==0 && array1[i]!=0) {
                        array2[j] = array1[i];
                        System.out.print(array2[j] + " ");
                    }
                }
            }
        }
    }
}


