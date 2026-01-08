import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 일
        int B = sc.nextInt(); // 월
        int C = sc.nextInt(); // 분
        // Please write your code here.
        
        int answer = (A-11)*24*60 +  (B-11)*60 + (C-11) ;

        if(answer<0){
            System.out.print(-1);
        }else{
            System.out.print(answer);
        }
    }
}