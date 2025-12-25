import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 20 까지
        int d = sc.nextInt(); // 50 까지
        // Please write your code here.
        func1(m,d);
    }

    public static void func1(int m,int d) {
        boolean is = false;
        if(m==1 && m==3 && m==5 && m==7 && m==8 && m==10 && m==12){
            if(d<=31){
                is = true;
            }
        }else if(m==4 && m==6 && m==9 && m==11){
            if(d<=30){
                is = true;
            }
        }else if(m==2){
            if(d<=28){
                is = true;
            }
        }

        if(is){
            System.out.print("Yes");
        }else if(!is){
            System.out.print("No");
        }
        
    }
}