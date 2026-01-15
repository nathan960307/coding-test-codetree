import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수행 명령 수
        int offset = 10000; // 음수 보정
        int[] arr = new int[20001]; // 겹치는 지점 표시 배열, 왼쪽 최대 1000칸 오른쪽 최대 1000
        int[] cnt = new int[20001]; // 겹치는 지점 표시 배열, 왼쪽 최대 1000칸 오른쪽 최대 1000

        int start = 0;
        int end = 0;

        int index = 0;

        int max = 0;
        int min = 0;

        int count = 0;
        int white = 0;
        int black = 0;
        int gray = 0;

        // 배열 숫자 0 은 white
        // 배열 숫자 1 은 black
        // 두 번 이상 칠해진 곳은 gray

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
                    arr[j+offset] = 0; // 타일 색상 0으로 변경(white)
                    cnt[j+offset] += 1; // 갯수 저장 배열에 1 추가
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
                    arr[j+offset] = 1; // 타일 색상 1로 변경(black)
                    cnt[j+offset] += 10000; // 갯수 저장 배열에 10000 추가
                    
                }
                index = end; // 마지막으로 뒤집은 위치

            }
        }

        for(int i=min; i<=max; i++ ){
            if(cnt[i+offset] >=20002){
                if(arr[i+offset] == 0){
                    gray++;
                }else if(arr[i+offset] == 1){
                    gray++;
                }

            }else{
                if(arr[i+offset] == 0){
                    white++;
                }else if(arr[i+offset] == 1){
                    black++;
                }
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}