import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 직사각형의 수
        // 빨->파-빨->파 순으로 덮음
        // 빨 = 0 짝수
        // 파 = 1 홀수

        int[][] s = new int [201][201];
        int answer = 0;
        int offset = 100;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for(int j=x1; j<x2; j++){
                for(int k=y1; k<y2; k++){
                    if(i%2==0){ // 짝수번째 인 경우 -> 빨
                        s[j][k] = 1;
                    }else{ // 홀수번째 인 경우 -> 파
                        s[j][k] = 2;
                    }
                }
            }
        }

        for(int j=0; j<201; j++){
            for(int k=0; k<201; k++){
                if(s[j][k]==2){
                    answer++;
                }
            }
        }

        System.out.print(answer);
        
    }
}
