import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        char answer = (char)((int)a +1);
        if( answer == '{'){
            answer = 'a';
        }

        System.out.print(answer);
    }
}




