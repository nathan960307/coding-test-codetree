import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = 0;
        int sum = 0;
        int[] arr = new int[105];

        for (int i = 0; i < 105; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                index = i;
                break;
            }
        }
        if(index >=3){
            for (int i = index-3; i < index; i++) {
            sum = sum + arr[i];
            }
        }
        

        System.out.println(sum);
    }
}
