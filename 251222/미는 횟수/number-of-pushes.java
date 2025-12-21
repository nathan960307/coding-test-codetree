import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int len = a.length();

        int count = 0;

        while(true){
            a = a.substring(len-1,len) + a.substring(0,len-1);
            count++;

            if(a.equals(b)){
                System.out.print(count);
                break;
            }

            if(count >= len){
                System.out.print(-1);
                break;

            }
            
        }


    }
}




