import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int[] arr = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int index = 0;

        while(true){
            int temp = sc.nextInt();
            if(temp == 999 || temp == -999){
                break;
            }
            arr[index++] = temp;
        }


        for (int i = 0; i < index; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.printf("%d %d",max,min);
    }
}
