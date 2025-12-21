import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int count = 0; 

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            sum += a;
        }

        String s = Integer.toString(sum);
        String answer = s.substring(1,s.length())+s.substring(0,1);
        System.out.print(answer);

    }
}




