import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int sum = 0;
        int count =0;
        double avg = 0.0;
        int temp =2;
        boolean is = false;

        for(int i=1; i<=5; i++){
            int n = sc.nextInt();

            if(n % 3 == 0 ){
                count++;
            }
        }
        
        if(count==5){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
        
}
}