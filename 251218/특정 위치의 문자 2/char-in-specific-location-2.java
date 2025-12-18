import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = 0;
        int sum = 0;
        char[] arr = new char[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
            
        }
        
        for (int i = 0; i < 10; i++) {
            if((i+1) == 2||(i+1) == 5||(i+1) == 8)
            System.out.print(arr[i] + " ");
            
        }
        
        
    }
}
