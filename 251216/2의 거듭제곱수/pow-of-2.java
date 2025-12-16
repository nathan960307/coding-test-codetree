import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int sum = 0;
        int count =1;
        double avg = 0.0;
        int temp =2;

        while(true){
            temp = temp * 2 ;
            count++;
            if(n == temp){
                break;
            }
    }
    System.out.println(count);
}
}