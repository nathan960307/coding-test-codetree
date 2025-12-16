import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int sum = 0;
        int count =0;
        double avg = 0.0;
        int temp =2;

        while(n>1){
            n = n / 2;
            count++;
    }
    System.out.println(count);
}
}