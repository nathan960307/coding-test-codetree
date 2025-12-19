import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int index = n;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        while(index >0){
            int max = 0;

            // 최댓값 찾기
            for(int i=0; i<index; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }

            // 최댓값 index 찾기
            for(int i=0; i<n; i++){
                if(arr[i]==max){
                    index = i;
                    System.out.print(i+1 + " ");
                    break;
                }
            }
        }
    }
}
