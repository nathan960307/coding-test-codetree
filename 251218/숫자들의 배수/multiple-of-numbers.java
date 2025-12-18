import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int n = sc.nextInt();
        int a = sc.nextInt();
        int index =0;
        int count =0;

        // arr[0] = a;
        // arr[1] = b;

        while(index <2){
            
            count++;
            
            System.out.print(a*(count)+" ");

            if(a*(count) %5==0){
                index++;
            }
        }


        // 10번째 항 출력
        // System.out.println(arr[10]);
    }
}

