import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int n = sc.nextInt();
        int index =0;
        int[] arr = new int[n];

        // arr[0] = a;
        // arr[1] = b;

        for (int i = 0; i < n; i++) {
             
            arr[i] = sc.nextInt();
            
            
        }

        for (int i = 0; i <n ; i++) {
            if(arr[i] %2==0){
                System.out.print(arr[i] + " ");
            }
            
            
        }

        // 10번째 항 출력
        // System.out.println(arr[10]);
    }
}

