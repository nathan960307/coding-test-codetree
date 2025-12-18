import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int n = sc.nextInt();
        
        int[] arr = new int[4];

        // for(int i=0; i< 100; i++){
        //     arr[i] = sc.nextInt();
        // }
        while(sc.hasNext()){
            int is = sc.next().charAt(0);
            int temp = sc.nextInt();

            if(temp>=37){
                if(is == 'Y'){
                    arr[0] += 1;
                }else if(is == 'N'){
                    arr[1] += 1;  
                }
            }else if(temp < 37){
                if(is == 'Y'){
                    arr[2] += 1;
                }else if(is == 'N'){
                    arr[3] += 1;     
                }
            }
        }

        for(int i=0; i<4; i++){
            System.out.printf("%d ",arr[i]);
        }

        if(arr[0] >= 2){
            System.out.printf("E");

        }
    }
}
