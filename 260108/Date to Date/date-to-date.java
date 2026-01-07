import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(); // 월
        int d1 = sc.nextInt(); // 일
        int m2 = sc.nextInt(); // 월
        int d2 = sc.nextInt(); // 일
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Please write your code here.
        int month = m1;
        int day = d1;
        int answer = 1;

        while(true){
            if(month== m2 && day == d2){
                break;
            }

            day++;
            answer++;

            if(day > num_of_days[month]){
                month++;
                day = 1;
            }
        }
        System.out.print(answer);
    }
}


