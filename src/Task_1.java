import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[][] arr = new int[5][9];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToAdd = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                Заполняем массив
                arr[i][j] = random.nextInt(100);
//                добавляем к элемент у массива заданное пользователем число
                arr[i][j] += numberToAdd;
//                находим сумму всех элементов массива после добавления пользовательского числа
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
