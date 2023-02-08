import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int student = sc.nextInt();
        int winner = sc.nextInt();

        Integer[] arr = new Integer[student];

        for (int i = 0; i < student; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[winner-1]);
    }
}