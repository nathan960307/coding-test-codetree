import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        func1(a,b);
    }

    public static void func1(int[] a,int[] b) {
        boolean isSub = false; 
        for(int i=0; i<=a.length - b.length; i++){
            boolean match = true;
            for(int j=0; j<b.length; j++ ){
                if(a[i+j]!=b[j]){
                    match = false;
                    break;
                }
            }

            if(match){
                isSub = true;
                break;
            }
        }

        if(isSub){
            System.out.print("Yes");
        }else if(!isSub){
            System.out.print("No");
        }


    }
}