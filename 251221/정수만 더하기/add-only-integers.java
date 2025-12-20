import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        int sum =0;

        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(c>=48 && c <= 57){ // 숫자인 경우
                sum += c - '0';
            }
        }


        System.out.print(sum);


    }
}




