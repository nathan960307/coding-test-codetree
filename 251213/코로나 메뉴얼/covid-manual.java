import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int a_tem = sc.nextInt();
        char b = sc.next().charAt(0);
        int b_tem = sc.nextInt();
        char c = sc.next().charAt(0);
        int c_tem = sc.nextInt();

        int count = 0;
        
        if(a == 'Y' && a_tem >= 37){
            count++;
        }

        if(b == 'Y' && b_tem >= 37){
            count++;
        }

        if(c == 'Y' && c_tem >= 37){
            count++;
        }

        if( count >= 2){
            System.out.println('E');
        }else{
            System.out.println('N');
        }
        

        
    }
}
