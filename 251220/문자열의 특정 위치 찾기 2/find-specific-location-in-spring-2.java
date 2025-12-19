import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange"};

        char c = sc.next().charAt(0);
        int count = 0;

        for(String a : arr){
            if(a.charAt(2)== c || a.charAt(3)== c){
                System.out.println(a);
                count++;
            }
        }
        System.out.print(count);
    }
}




