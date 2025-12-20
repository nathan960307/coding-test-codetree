import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char answer = 'a'; // 빈값 선언이 불가능

        if(a=='a'){
            answer = 'z';
        }else{
            answer = (char)(a-1);
        }
        

        System.out.print(answer);
    }
}




