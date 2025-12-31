import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cal[] cals = new cal[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            cals[i] = new cal(date,day,weather);
            // Please write your code here.
        }

        for(int i = 0; i < n; i++) {
            if(cals[i].weather.equals("Rain")){
                System.out.print(cals[i].date + " " + cals[i].day + " " + cals[i].weather);
                break;
            }
        }
    }
}

class cal {
    String date;
    String day;
    String weather;

    public cal(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
};