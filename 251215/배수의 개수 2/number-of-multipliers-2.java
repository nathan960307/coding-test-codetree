import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();

            if(i % 2 !=0){
                count++;
            }
            
        }

        System.out.print(count);
    }
}
