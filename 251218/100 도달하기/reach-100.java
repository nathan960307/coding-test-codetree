import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int n = sc.nextInt();
        
        int index =2;
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = n;

        for (int i = 2; i < 20; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            index++;
            
            if(arr[i]>100){
                break;
            }
        }

        for (int i = 0; i <index ; i++) {
            System.out.print(arr[i] + " "); 
        }

        // 10번째 항 출력
        // System.out.println(arr[10]);
    }
}

