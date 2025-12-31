import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.


        bomb c = new bomb(uCode,lColor,time);

        System.out.println("code : " + c.uCode);
        System.out.println("color : " + c.lColor);
        System.out.println("second : " + c.time);
    }
}

class bomb {
    String uCode;
    char lColor;
    int time;

    public bomb(String uCode, char lColor, int time){
        this.uCode = uCode;
        this.lColor = lColor;
        this.time = time;
    }
};