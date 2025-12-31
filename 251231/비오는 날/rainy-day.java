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
        int index = 0;
        String min ="9999-99-99";

        for(int i = 0; i < n; i++) {
            if(cals[i].weather.equals("Rain") && cals[i].date.compareTo(min) <0){
                min = cals[i].date;
                index = i;
            }
        }

        System.out.print(cals[index].date + " " + cals[index].day + " " + cals[index].weather);
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