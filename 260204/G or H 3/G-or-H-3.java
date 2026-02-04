import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] arr = new char[10001];
        for (int i = 0; i < n; i++){
            int index = sc.nextInt();
            arr[index] = sc.next().charAt(0);
        }
        int max = 0;
        for(int i=0; i<=10000-k; i++){
            int score = 0;
            for(int j=i; j<=i+k; j++){
                
                if(arr[j]=='G'){
                    score += 1;
                }else if(arr[j]=='H'){
                    score += 2;
                }

            }
            max = Math.max(max,score);
        }

        System.out.print(max);
            
    }
}