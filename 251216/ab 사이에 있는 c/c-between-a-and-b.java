import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;
        int count =0;
        double avg = 0.0;
        int temp =2;
        boolean is = false;

        for(int i=a;i<=b;i++){
            if(i%c==0){
                is = true;
                break;
            }
        }
        
        if(is){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
}
}