import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        func1(n);
    }

    public static void func1(int n){
        int count =1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(count==10){
                    count = 1;
                }
                System.out.print(count++ + " ");
            }
            System.out.println("");
        }
    }
}