import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char[] arr = new char[]{'L','E','B','R','O','S'};

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean is = false;
        int index = 0;
        int count = 0;

        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i]==m){
                count++;
            }
        }
        
        System.out.print(count);

        // if(is){
        //     System.out.print(index);
        // }else{
        //     System.out.print("None");
        // }
    }
}
