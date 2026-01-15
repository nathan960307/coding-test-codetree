import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수행 명령 수
        int offset = 10000; // 음수 보정

        int[] w = new int[20001]; 
        int[] b = new int[20001]; 
        int[] color = new int[20001]; 


        int start = 0;
        int end = 0;

        int index = 0;

        int max = 0;
        int min = 0;

        int count = 0;
        int white = 0;
        int black = 0;
        int gray = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt(); // 칸 수
            char d = sc.next().charAt(0); // 이동 방향 지정 , L R
            // Please write your code here.

            if(d == 'L'){ // 왼쪽으로 이동인 경우
            start = index - x +1;
            end = index ;

                if(end > max){
                    max = end;
                }
                if(start < min){
                    min = start;
                }

                for(int j=start; j<=end; j++){ // 스타트 지점 제외 
                    w[j+offset]++; 
                    color[j+offset] = 1; 
                    
                    
                }
                index = start; // 마지막으로 뒤집은 타일 위치

            }else if(d == 'R'){ // 오른쪽으로 이동인 경우
            start = index ;
            end = index + x -1;

                if(end > max){
                    max = end;
                }
                if(start < min){
                    min = start;
                }

                for(int j=start; j<=end; j++){ // 종료 지점 제외
                    b[j+offset]++; 
                    color[j+offset] = 2; 
                    
                }
                index = end; // 마지막으로 뒤집은 위치

            }
        }

        for(int i=min; i<=max; i++ ){
            if(w[i+offset] >=2 && b[i+offset]>=2){
                gray++;
            }else{
                if(color[i+offset] == 1){
                    white++;
                }else if(color[i+offset] == 2){
                    black++;
                }
            }

        
        }
        System.out.print(white + " " + black + " " + gray);
    }
}