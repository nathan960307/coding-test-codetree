import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }
        // Please write your code here.
        // 능력 합계
        int sum = 0;
        for(int i=0; i<6; i++){
            sum = sum + ability[i];
        }

        int diff = 2100000000;
        for(int i=0; i<6; i++){
            for(int j=i+1; j<6; j++){
                for(int k=j+1; k<6; k++){
                    int sum1 = ability[i] + ability[j] + ability[k]; // 팀1의 합계
                    int sum2 = sum - sum1; // 팀 2의 합계
                    int temp = Math.abs(sum2-sum1); // 두 팀의 차

                    diff = Math.min(diff, temp);

                }
            }
        }
        System.out.print(diff);
    }
}