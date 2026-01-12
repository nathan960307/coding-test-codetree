import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int len = binary.length();
        int answer =0;
        // Please write your code here.

        for(int i=0; i<len; i++){
            int temp = binary.charAt(i);
            answer = answer + (int)Math.pow(2,len-1-i) * temp;

        }

        System.out.print(answer);
    }
}