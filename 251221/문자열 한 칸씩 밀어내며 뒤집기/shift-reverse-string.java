import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        int len = s.length();

        for(int i=0; i<q; i++){
            int a = sc.nextInt();

            if(a==1){
                s = s.substring(1,s.length()) + s.substring(0,1); //좌로 밀기
                System.out.println(s);
            }else if(a==2){
                s = s.substring(len-1,len) + s.substring(0,len-1); // 우로 밀기
                System.out.println(s);

            }else if(a==3){
                char[] arr = new char[len];
                for(int j=0; j<len; j++){
                    arr[i] = s.charAt(len-1-j);
                }
                s = new String(arr);
                System.out.println(s);

            }
        }


    }
}




