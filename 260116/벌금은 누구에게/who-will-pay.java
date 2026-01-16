import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 주어지는 벌칙의 수
        int k = sc.nextInt(); // 벌칙 한계 횟수
        int[] penalizedPerson = new int[m];
        int answer = -1;
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] student = new int[n+1];

        for(int i=0; i<m; i++){
            int temp = penalizedPerson[i];
            student[temp]++;

            if(student[temp] >= k){
                answer = temp;
                break;
            }
        }

        System.out.print(answer);


    }
}