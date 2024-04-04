import java.util.Scanner;

public class HardTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество строк");
        int n = scanner.nextInt();
        System.out.println("Введите колличество столбцов");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    arr[i][j] = num;
                    num++;
                }
            }
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = num;
                    num++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            boolean isToLongNumber = false;
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < 10) {
                    System.out.print("  " + arr[i][j] + " ");
                }
                if (arr[i][j] < 100 && arr[i][j] >= 10) {
                    System.out.print(" " + arr[i][j] + " ");
                }
                if (arr[i][j] < 1000 && arr[i][j] >= 100) {
                    System.out.print(arr[i][j] + " ");
                }
//                Если число больше 999 вывод этого числа не происходит, по условию только 3 символа на вывод
                // если число больше 999 пустые строки не добавляются
                if (arr[i][j] > 999) {
                    isToLongNumber = true;
                }
            }
            if (isToLongNumber) {
                break;
            }
            System.out.println();
        }
    }
}
