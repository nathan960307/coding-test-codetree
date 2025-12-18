import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int index = 0;
        int odd_sum = 0;
        int even_sum = 0;
        int[] arr = new int[10];

        for (int i = 0; i < n; i++) {
            // arr[i] = sc.next().charAt(0);
            arr[i] = sc.nextInt();
            
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] * arr[i] + " ");

            }
        

        int max = odd_sum > even_sum? odd_sum : even_sum;
        int min = odd_sum < even_sum? odd_sum : even_sum;
        int result = max - min;

        
        
    }
}
