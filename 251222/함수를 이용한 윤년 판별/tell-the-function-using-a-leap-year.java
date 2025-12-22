import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        boolean answer = func1(y);
        System.out.print(answer);
    }

    public static boolean func1(int y) {
        boolean answer = false;

        if(y%4==0){
            if(y%100==0 && y%400!=0){
                answer = false;
            }else{
                answer = true;
            }
        }else{  
            answer = false;
        }


        return answer;
    }
}