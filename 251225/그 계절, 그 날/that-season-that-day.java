import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        func1(y,m,d);
    }

    public static void func1(int y, int m,int d) {
        boolean is = false;
        String season = "";
        boolean leap = false;

        // 윤년 판별
        if(y%4==0){
            if(y%100==0 && y%400 !=0){
                leap = false;
            }else if(y%100==0 && y%400 ==0){
                leap = true;
            }else{
                leap = true;
            }
        }
        // System.out.print(leap);

        // 날짜 존재 판별
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            if(d<=31){
                is = true;
            }
        }else if(m==4 || m==6 || m==9 || m==11){
            if(d<=30){
                is = true;
            }
        }else if(m==2){
            if(leap){ // 윤년인 경우
                if(d<=29){
                    is = true;
                }
            }else{ // 윤년이 아닌 경우
                if(d<=28){
                    is = true;
                }
            }
        }
        // System.out.print(is);

        // 계절 판별
        if(m>=3 && m<=5){
            season = "Spring";
        }else if(m>=6 && m<=8){
            season = "Summer";
        }else if(m<=11 && m>=9){
            season = "Fall";
        }else if(m<=2 || m>=12){
            season = "Winter";
        }

        if(is){
            System.out.print(season);
        }else if(!is){
            System.out.print(-1);
        }
        
    }
}