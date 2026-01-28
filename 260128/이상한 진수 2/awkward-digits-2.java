import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        boolean changed = false;

        for(int i=0; i<len; i++){
            int temp = a.charAt(i);
            if(temp=='0'){
                a = a.substring(0,i) + 1 + a.substring(i+1,len);
                changed = true;
                break;
            }
        }

        int decimal = Integer.parseInt(a, 2);

        if(!changed){
            a = a.substring(0, len - 1) + "0";
        }

        System.out.print(decimal);
    }
}