import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(); //월
        int d1 = sc.nextInt(); // 일
        int m2 = sc.nextInt(); // 월
        int d2 = sc.nextInt(); // 일
        String A = sc.next(); // 요일
        String[] daysOfWeek = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        // Please write your code here.
        int days = betweenDays(m1,d1,m2,d2);

        int answer = days / 7;

        int temp = days % 7;

        for(int i = 0; i < temp; i++){
            if(daysOfWeek[i].equals(A)){
                answer++;
            }
        }
        
        System.out.print(answer);
        
    }

    static int betweenDays(int m1,int d1, int m2, int d2){
        int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 윤년
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
        
        return answer;
    }
}