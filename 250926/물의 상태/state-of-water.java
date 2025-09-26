import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        
        
        if(num1 < 0){
            System.out.print("ice");
        }else if(num1 >=100){
            System.out.print("vapor");
        }else{
            System.out.print("water");
        }

    

        
    }
}
