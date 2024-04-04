import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        Random random = new Random();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println(max);
    }
}