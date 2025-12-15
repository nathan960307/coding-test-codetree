import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        double avg = 0;

        for (int i = 1; i <a; i++) {
            if(a % i==0){
                sum = sum + i;
            }
        }

        if(sum == a){
            System.out.printf("P");
        }else{
            System.out.printf("N");
        }
        
    }
}
