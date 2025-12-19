import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n 입력
        int[] arr = new int[n]; // n 크기의 배열 선언

        // n 크기의 배열 생성 및 입력 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // 내림차순으로 정렬
        for (int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        
        if(n==1){
            System.out.print(arr[0]);
            return;
        }

        // 맨 앞 체크
        if (arr[0] != arr[1]) {
            System.out.print(arr[0]);
            return;
        }

        // 중간 체크
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                System.out.print(arr[i]);
                return;
            }
        }

        // 맨 뒤 체크
        if (arr[n - 1] != arr[n - 2]) {
            System.out.print(arr[n - 1]);
            return;
        }

        // 유일한 값 없음
        System.out.print(-1);
             
        
    }
}
