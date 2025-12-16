import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int sum = 0;
        int count =0;
        double avg = 0.0;

        while(true){
            if(n % 2 ==0){
                n = n / 2 ;
                count++;
            }else if(n == 1){
                break;
            }else{
                n = (n * 3) +1;
                count++;
            }  
        }
        System.out.println(count);
    }
}
