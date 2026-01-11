import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(); // 월
        int d1 = sc.nextInt(); // 일
        int m2 = sc.nextInt(); // 월
        int d2 = sc.nextInt(); // 일
        String[] daysOfWeek = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        // Please write your code here.

        int day1 = dayOfYear(m1, d1);
        int day2 = dayOfYear(m2, d2);

        int diff = day2 - day1;
        int idx = diff % 7;

        // 음수 보정하기
        if (idx < 0){
            idx += 7;
        } 

        System.out.println(daysOfWeek[idx]);
        
        
    }


static int dayOfYear(int m, int d) {
    int[] num_of_days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    int sum = 0;

    for (int i = 1; i < m; i++) {
        sum += num_of_days[i];
    }
    sum += d;

    return sum;
}
}