import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next(); 
        StringBuilder sb = new StringBuilder(a);

        sb.setCharAt(1,'a');
        sb.setCharAt(a.length()-2,'a');
        System.out.println(sb.toString());

    
    }
}