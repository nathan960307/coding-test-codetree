import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수행 명령 수
        int offset = 1000; // 음수 보정
        int[] arr = new int[2001]; // 겹치는 구간 표시 배열, 왼쪽 최대 1000칸 오른쪽 최대 1000
        int start =0;
        int end =0;
        int index =0;
        int max = 0;
        int min = 0;
        int count =0;

        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt(); // 칸 수
            char dir = sc.next().charAt(0); // L R
            // Please write your code here.

            if(dir == 'L'){ // 왼쪽으로 이동인 경우
            start = index - x ;
            end = index ;

                if(end > max){
                    max = end;
                }
                if(start < min){
                    min = start;
                }

                for(int j=start; j<end; j++){
                    arr[j+offset] = arr[j+offset] + 1;
                }
                index = start;

            }else if(dir == 'R'){ // 오른쪽으로 이동인 경우
            start = index ;
            end = index + x ;

                if(end > max){
                    max = end;
                }
                if(start < min){
                    min = start;
                }

                for(int j=start; j<end; j++){
                    arr[j+offset] = arr[j+offset] + 1;
                    
                }
                index = end;

            }
        }

        for(int i=min; i<max; i++ ){
            if(arr[i+offset] >=2){
                count++;
            }
        }

        System.out.print(count);
    }
}