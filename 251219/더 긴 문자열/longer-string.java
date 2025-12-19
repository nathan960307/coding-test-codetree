import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int len1 = s1.length();
        int len2 = s2.length();


        if(len1 == len2 ){
            System.out.println("same");
        }else if(len1 > len2){
            System.out.println(s1 + " " + s1.length());
        }else if(len2 > len1){
            System.out.println(s2 + " " + s2.length());
        }
        
        
            
        

    }
}
