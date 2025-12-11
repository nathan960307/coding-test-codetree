import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        int m3 = 0;
        int m5 = 0;
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            if(arr[i] % 3 == 0 && arr[i] % 5 != 0 ){
                m3 += 1;
            }else if(arr[i] % 5 == 0 && arr[i] % 3 != 0){
                m5 += 1;
            }else if(arr[i] % 3 == 0 && arr[i] % 5 == 0){
                m3 += 1;
                m5 += 1;
            }
        }
        System.out.print(m3 + " " + m5);
        
    }
}