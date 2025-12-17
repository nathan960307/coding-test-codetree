import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int sum = 1;
        int count = 0;

        for (int i = 0; i < m; i++) {

            int n = sc.nextInt();

            while(n!=1){
                if(n%2==0){
                    n = n/2;
                }else{
                    n = 3*n +1;
                }
                count++;
                
            }
            System.out.println(count);
            count = 0;
        }
    }
}
