import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int total = num1 + num2;
        double average = (double)total / 2;
        
        System.out.printf("%d %.1f",total,average);
    }
}
