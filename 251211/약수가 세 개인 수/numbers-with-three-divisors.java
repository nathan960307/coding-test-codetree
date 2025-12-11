import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int answer =0;
        
        for(int i=start; i<=end; i++){ // start ~ end 까지 반복
            int sum = 0; // sum of divisors
            for(int j =1; j<=i; j++){
                if(i % j == 0){
                    sum +=1;
                }
            }
            
            if(sum == 3){
                answer = i;
                break;
            }
        }
        System.out.println(answer);

        
    }
}