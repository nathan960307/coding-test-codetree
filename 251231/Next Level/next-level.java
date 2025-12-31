import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        user a = new user("codetree",10);
        user b = new user(id,level);

        System.out.println("user "+ a.id + " lv " + a.level);
        System.out.println("user "+ b.id + " lv " + b.level);

    }
}
class user{
    String id;
    int level;

    public user(String id, int level){
        this.id = id;
        this.level = level;
    }
}