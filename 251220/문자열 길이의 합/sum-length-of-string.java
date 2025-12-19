import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange"};
        int n = sc.nextInt();
        String[] arr = new String[n];
        int sum = 0;
        int count = 0;

        for(int i=0; i<n; i++){
             arr[i] = sc.next();
             sum = sum + arr[i].length();
             if(arr[i].charAt(0)=='a'){
                count++;
             }
        }
        
        System.out.print(sum + " " + count);
    }
}




