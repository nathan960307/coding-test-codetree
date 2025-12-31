import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.
        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();

        code c = new code(sCode,mPoint,time);

        System.out.println("secret code : " + c.sCode);
        System.out.println("meeting point : " + c.mPoint);
        System.out.println("time : " + c.time);
    }
}

class code{
    String sCode;
    char mPoint;
    int time;

    public code(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }


}