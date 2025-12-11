import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String[] arr = {"apple","banana","grape","blueberry","orange"};

        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int sum = 0;
        for(String r : arr){
            if(r.charAt(2) == a || r.charAt(3) == a){
                System.out.println(r);
                sum += 1;
            }
        }
        System.out.println(sum);


    }
}