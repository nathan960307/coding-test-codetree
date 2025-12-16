import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count =0;
        double avg = 0.0;

        while(true){
            int a = sc.nextInt();

            if(a>=20 && a<30){
                sum = sum + a;
                count++;
            }else{
                break;
            }

            
        }
        avg = (double)sum / count;

            System.out.printf("%.2f",avg);
    }
}
