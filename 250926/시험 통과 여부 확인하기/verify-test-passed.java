import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        
        if(num1>=80){
            System.out.println("pass");
        }else{
            System.out.println(80 - num1 + " more score");
        }
        
    }
}
