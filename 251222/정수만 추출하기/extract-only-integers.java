import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String num1 = "";
        String num2 = "";

        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);

            if(c >= '0' && c <= '9'){
                num1 += c;
            }else{
                break;
            }
        }

        for(int i=0; i<b.length(); i++){
            char c = b.charAt(i);

            if(c >= '0' && c <= '9'){
                num2 += c;
            }else{
                break;
            }
        }

        
        int answer = Integer.parseInt(num1) + Integer.parseInt(num2);

        System.out.print(answer);
    }
}




