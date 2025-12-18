import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int first = 0;
        int second = 0;

        // 배열 입력 받기
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        for (int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        first = arr[0];
        second = arr[1];

        System.out.printf("%d %d",first,second);
    }
}
