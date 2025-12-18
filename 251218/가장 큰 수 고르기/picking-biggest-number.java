import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int[] arr = new int[10];
        int max = 0;
        
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
