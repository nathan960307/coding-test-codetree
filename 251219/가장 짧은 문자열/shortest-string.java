import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        int answer =0;


        if(len1 > len2 && len1 > len3){
            if(len2 <= len3){
                answer = len1 - len2;
            }
        }else if(len2 > len3 && len2 > len1){
            if(len3 <= len1){
                answer = len2 - len3;
            }
        }else if(len3 > len2 && len3 > len1){
            if(len2 <= len1){
                answer = len3 - len2;
            }
        }
        
        System.out.print(answer);
            
        

    }
}
