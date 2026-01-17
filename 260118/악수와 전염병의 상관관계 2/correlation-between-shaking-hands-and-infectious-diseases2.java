import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개발자의 수
        int[] n = new int[N+1]; // 개발자 배열 (0번 보정)
        int K = sc.nextInt(); // 전염병을 옮기게 되는 악수 횟수
        int[] k = new int[N+1]; // 개발자별 전염병을 옮기게 되는 악수 횟수 배열 (0번 보정)
        int P = sc.nextInt(); // 전염병에 처음 걸린 개발자 번호 
        n[P] =1; // 개발자 배열에 초기 양성자로 등록
        k[P] = K; // 전염 배열에 남은 횟수 등록
        int T = sc.nextInt(); // 횟수
        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // 시간
            shakes[i][1] = sc.nextInt(); // 개발자 x
            shakes[i][2] = sc.nextInt(); // 개발자 y
        }

        Arrays.sort(shakes, (a, b) -> a[0] - b[0]); // 첫 열(시간)을 기준으로 오름차순으로 정렬


        for(int i=0; i<T; i++){
            int x = shakes[i][1]; // 개발자 x
            int y = shakes[i][2]; // 개발자 y

            if(n[x]==1 && n[y]==0){ // x가 감염자인 경우
                if(k[x] > 0){ // 감염가능 횟수가 남아 있는 경우
                    n[y] = 1; // y의 감염자 등록
                    k[y] = K; // y의 남은 전염 가능 횟수 등록 
                    k[x]--; // x 의 남은 점염 가능 횟수 차감
                }else if(k[x] <= 0){ // 감염가능 횟수가 남아 있지 않는 경우
                    continue;
                }

            }else if(n[y]==1 && n[x]==0){ // y가 감염자인 경우
                if(k[y] > 0){ // 감염가능 횟수가 남아 있는 경우
                    n[x] = 1; // y의 감염자 등록
                    k[x] = K; // y의 남은 전염 가능 횟수 등록 
                    k[y]--; // x 의 남은 점염 가능 횟수 차감
                }else if(k[y] <= 0){ // 감염가능 횟수가 남아 있지 않는 경우
                    continue;
                }

            }else if(n[x]==1 && n[y]==1){ // x와 y가 둘다 감염자인 경우
                if(k[x] > 0){
                    k[x]--;
                }
                if(k[y] > 0){
                    k[y]--;
                }
            }else if(n[x]==0 && n[y]==0){ // x와 y가 둘다 감염자가 아닌 경우
                continue; // 둘다 감염자가 아닌경우 처리해줄 로직이 존재하지 않
            }
        }

        for(int i=1; i<=N; i++){
            System.out.print(n[i]);
        }
        
    }
}