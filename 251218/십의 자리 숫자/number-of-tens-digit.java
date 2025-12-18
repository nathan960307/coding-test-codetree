import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int n = sc.nextInt();
        
        int[] arr = new int[100];
        int index =0;

        // for(int i=0; i< 100; i++){
        //     arr[i] = sc.nextInt();
        // }
        while(true){
            int temp = sc.nextInt();
            if(temp==0){
                break;
            }
            arr[index++] = temp;
        }


        for(int i=1; i<10; i++){
            int count =0;
            for(int j=0; j<100;j++){

                if(arr[j]==0){
                    break;
                }

                if(arr[j]/10==i){
                    count++;
                }
            }
            System.out.printf("%d - %d\n",i,count);
        }
    }
}
