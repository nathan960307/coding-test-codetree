import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        func1(A,B);
    }

    public static void func1(int a, int b) {
        int count = 0;

        for(int i=a; i<=b; i++){

            if(i%3==0){
                count++;
                continue;
            }

            int temp = i;
            while(temp>0){
                
                if(temp%10==3||temp%10==6||temp%10==9){
                    count++;
                    break;
                }

                temp = temp /10;
                
            }
        }

        System.out.println(count);

        
    }

    
}