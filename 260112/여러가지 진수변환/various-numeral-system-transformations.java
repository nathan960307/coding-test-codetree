import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 10진수인 정수
        int b = sc.nextInt(); // 변경할 진수, 4 8 두 가지로 주어짐
        // Please write your code here.
        int[] arr = new int[10];
        int count = 0;

        int answer = 0;

        while(true){
            if(n < 2){
                arr[count++] = n;
                break;
            }

            arr[count++] = n % b;
            n = n / b;
            
        }

        for(int i = count - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
            
    }
}


