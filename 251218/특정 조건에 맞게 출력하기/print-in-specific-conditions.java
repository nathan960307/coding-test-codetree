import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        int index =0;
        int[] arr = new int[100];

        // arr[0] = a;
        // arr[1] = b;

        for (int i = 0; i < 100; i++) {
            
            int temp = sc.nextInt();
            
            if(temp ==0){
                break;
            }else{
                if(temp %2!=0){ // 홀수
                    arr[i] = temp + 3;
                }else{
                    arr[i] = temp /2;
                }
            }
            index++;
        }

        for (int i = 0; i <index ; i++) {
            System.out.print(arr[i] + " "); 
        }

        // 10번째 항 출력
        // System.out.println(arr[10]);
    }
}

