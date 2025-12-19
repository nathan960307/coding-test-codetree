import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int[] arr = new int[10];
        int over = 1001; // 500을 초과하는 수중 가장 작은 수
        int under = 0; // 500 미만인 수중 가장 큰 수

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            if(arr[i]<500){
                if(arr[i] > under){
                    under = arr[i];
                }
            }else if(arr[i]>500){
                if(arr[i] < over){
                    over = arr[i];
                }
            }
        }
        
        
        
        System.out.printf("%d %d",under,over);
    }
}
