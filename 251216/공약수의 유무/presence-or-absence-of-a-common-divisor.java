import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int count =0;
        double avg = 0.0;
        int temp =2;
        boolean is = false;

        for(int i=a; i<=b; i++){
            if(2880 % i == 0 && 1920 % i ==0){
                is = true;
                break;
            }
        }
        
        if(is){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
        
}
}