import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = 0;
        int odd_sum = 0;
        int even_sum = 0;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            // arr[i] = sc.next().charAt(0);
            arr[i] = sc.nextInt();
            
        }
        
        for (int i = 0; i < 10; i++) {
            if(arr[i]%3==0){
                index = i;
                break;
            }
        }

        int max = odd_sum > even_sum? odd_sum : even_sum;
        int min = odd_sum < even_sum? odd_sum : even_sum;
        int result = max - min;

        System.out.println(arr[index-1]);
        
        
    }
}
