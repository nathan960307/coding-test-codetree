import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        func1(text,pattern);
    }

    public static void func1(String text, String pattern){
        if(text.contains(pattern)){
            int answer = text.indexOf(pattern);
            System.out.print(answer);
        }else{
            System.out.print(-1);
        }
    }
}