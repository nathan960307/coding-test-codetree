import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 집 갯수
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.

        int min = Integer.MAX_VALUE;
        

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                
                sum = sum + (a[j] *Math.abs(j-i));
            }
            min = Math.min(sum,min);
        }

        System.out.print(min);
    }
}