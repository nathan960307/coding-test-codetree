import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();

        for(int i=0; i<len; i++){
            if(s.charAt(i)>=65 && s.charAt(i) <= 90){
                System.out.print(s.charAt(i));
            }else if(s.charAt(i)>=97 && s.charAt(i) <= 122){
                System.out.print((char)(s.charAt(i)-32));
            }
        }
    }
}




