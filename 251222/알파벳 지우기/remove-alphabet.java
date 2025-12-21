import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        a = a.replaceAll("[^0-9]", "");
        b = b.replaceAll("[^0-9]", "");

        int sum = Integer.parseInt(a) + Integer.parseInt(b);

        System.out.print(sum);

    }
}




