import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int total = num1 + num2 + num3;
        int average = total / 3;
        
        System.out.println(total);
        System.out.println(average);
        System.out.println(total-average);
    }
}
