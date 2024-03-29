import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); //N개의 크기를 가진 배열에 입력값을 넣어줌
        }
        Arrays.sort(arr);  //sort를 통해 오름차순으로 정렬
        System.out.println(arr[0]+ " " + arr[arr.length -1]);  //정렬시킨이후 0번째 인덱스값과 인덱스 -1의 값인 최대값을 가져옴 
    }
}
