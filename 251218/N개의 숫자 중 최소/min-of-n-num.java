import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int count = 0;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            if(arr[i] == min){
                count++;
            }
        }
        System.out.printf("%d %d",min,count);
    }
}
