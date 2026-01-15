import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 색종이 수
        int offset = 100; // 음수 보정 오프셋
        int[][] s = new int[201][201];
        int[] x = new int[n];
        int[] y = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt()+ offset;
            y[i] = sc.nextInt()+ offset;
        }

        for (int i = 0; i < n; i++) {
            for(int j=x[i]; j<x[i]+8; j++){
                for(int k=y[i]; k<y[i]+8; k++){
                    s[j][k]++;
                }
            }
        }

        for(int i=0; i<201; i++){
            for(int j=0; j<201; j++){
                if(s[i][j]>=1){
                    answer++;
                }
            }
        }

        System.out.print(answer);
        
    }
}