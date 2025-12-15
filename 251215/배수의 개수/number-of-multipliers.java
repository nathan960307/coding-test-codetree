import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();

            if(n % 3 ==0 && n % 5 ==0){
                count++;
            }
            
        }

        System.out.print(count);
    }
}
