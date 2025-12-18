import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n]; // n개의 원소
        
        
        for(int i=0; i<n; i++){ // n개의 원소 받기 
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++){ // q개의 질의 받기
            

            int type = sc.nextInt();

            if(type==1){ // 1번 질의
                int a = sc.nextInt();
                int answer = arr[a-1];

                System.out.println(answer);

            }else if(type==2){ // 2번 질의
                int b = sc.nextInt();
                int answer = -1;

                for(int j=0; j<n; j++){
                    if(b==arr[j]){
                        answer = j+1;

                        System.out.println(answer);

                        break;
                    }
                }

                if(answer == -1){
                    answer = 0;
                    System.out.println(answer);
                }
                
            }else if(type==3){ // 3번 질의
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j=s; j<=e; j++){
                    System.out.print(arr[j-1] + " ");
                }
                System.out.println("");
            }
        }
    }
}
