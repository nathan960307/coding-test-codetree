import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("\\."); // . 은 정규표현식으로 처리됨으로 이스케이프 문자 사용 필요
        System.out.println(strArr[1] + "-" + strArr[2] + "-" + strArr[0]);
    }
}
