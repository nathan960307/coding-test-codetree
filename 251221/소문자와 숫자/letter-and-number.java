import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();

        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(c>=65 && c <= 90){ // 대문자인 경우
                System.out.print((char)(c+32));
            }else if(c>=97 && c <= 122){ // 소문자인 경우
                System.out.print((char)(c-32));
                System.out.print(c);
            }else if(c>=48 && c <= 57){
                System.out.print(c);
            }
        }
    }
}




