import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        int count = 0;
        int prod = 1;
        int ones = 0;

        for (int i = 1; i <= a; i++) {
            ones = i %10;
            if(i % 7 < 4 || (i/8) %2 == 0 || (i % 2 ==0 && i % 4 !=0)){
                continue;
            }else{
                System.out.print(i + " ");
            }
        }

        
        
        
    }
}
