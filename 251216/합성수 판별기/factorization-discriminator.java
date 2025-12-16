import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int sum = 0;
        int count =0;
        double avg = 0.0;
        int temp =2;
        boolean is = false;

        for(int i=2;i<n;i++){
            if(n / i == 0){
                is = true;
                break;
            }
        }
        
        if(is){
            System.out.println("C");
        }else{
            System.out.println("N");
        }
        
        
}
}