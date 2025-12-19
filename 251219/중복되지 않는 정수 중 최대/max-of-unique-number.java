import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n 입력
        int[] arr = new int[n]; // n 크기의 배열 선언
        int min = 1001;
        int answer = -1;

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

        // 첫번째 수와 두번째 수가 다른지 비교
        int first = arr[0];
        int second = arr[1];

        if(first != second){ // 첫번째 와 두번째가 다른 경우 
            answer = first;
            // 정답 출력
            System.out.print(answer);
            
        }else{ // 첫번째와 두번째가 같은 경우
            for(int i=1; i<n; i++){
                if(arr[i]!=arr[i-1] && arr[i] != arr[i+1]){
                    answer = arr[i];
                }else if(arr[i] == arr[i-1]){
                    continue;
                }
            }
            System.out.print(answer);
        }
    }
}
