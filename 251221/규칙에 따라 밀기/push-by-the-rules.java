import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String command = sc.next();
        int len = s.length();
        int com_len = command.length();
        

        for(int i=0; i<com_len; i++){
            if(command.charAt(i)=='L'){
                s = s.substring(1,s.length()) + s.substring(0,1); //좌로 밀기
            }else if(command.charAt(i)=='R'){
                s = s.substring(len-1,len) + s.substring(0,len-1); // 우로 밀기
            }
        }

        System.out.print(s);
        
        
    }
}




