import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        int prod = 1;
        double avg = 0;
        
        int max = a>b? a : b;
        int min = a<b? a : b;


        for (int i = min; i <= max; i++) {
            prod = prod * i;
        }

        
        
        System.out.printf("%d",prod);
    }
}
