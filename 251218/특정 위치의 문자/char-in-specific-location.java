import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L','E','B','R','O','S'};

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        char n = sc.next().charAt(0);
        boolean is = false;
        int index = 0;
        
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        for (int i = 0; i < 6; i++) {
            if(arr[i]==n){
                is = true;
                index = i;
            }
        }

        if(is){
            System.out.print(index);
        }else{
            System.out.print("None");
        }
    }
}
