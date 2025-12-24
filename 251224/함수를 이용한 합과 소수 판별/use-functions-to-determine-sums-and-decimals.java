import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        func1(a,b);
    }

    public static void func1(int a,int b) {
        int count =0; 
        
        for(int i=a; i<=b; i++){
            int num = i;
            boolean is = true;
            int sum =0;
            
            while(i>0){
                sum = i % 10; 
                i = i/10;
            }

            for(int j=2; j<i; j++){
                if(i%j==0){
                    is = true;
                    break;
                }
            }

            if(sum%2==0 && is == false){
                count++;
            }
        }
        System.out.print(count);
    }
}