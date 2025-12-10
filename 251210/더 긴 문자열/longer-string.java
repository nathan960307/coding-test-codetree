import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        String answer = "";

        if(a.length() > b.length()){
            answer = a;
            System.out.print(answer + " " + answer.length());
        }
        else if( b.length() > a.length()){
            answer = b;
            System.out.print(answer + " " + answer.length());
        }
        else if( a.length() == b.length()){
            answer = "same";
            System.out.print(answer);
        }
    }
}