import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange"};
        String[] arr = new String[10];
        int sum = 0;

        for(int i=0; i<10; i++){
             arr[i] = sc.next();
             sum = sum + arr[i].length();
        }
        
        System.out.print(sum);
    }
}




