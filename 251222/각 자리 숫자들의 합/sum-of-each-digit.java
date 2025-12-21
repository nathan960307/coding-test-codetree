import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int count = 0; 

        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c >= '0' && c<= '9'){
                sum += c- '0';
            }
        }

        System.out.print(sum);

        

    }
}




