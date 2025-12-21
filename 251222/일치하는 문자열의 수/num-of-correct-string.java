import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();

        int count =0;

        for(int i=0; i<n; i++){
            String s = sc.next();

            if(a.equals(s)){
                count++;
            }

        }

        System.out.print(count);


    }
}




