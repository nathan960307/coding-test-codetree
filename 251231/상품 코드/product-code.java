import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        product a = new product("codetree",50);
        product b = new product(id2,code2);

        System.out.println("product "+ a.code2 + " is " + a.id2);
        System.out.println("product "+ b.code2 + " is " + b.id2);

    }
}
class product{
    String id2;
    int code2;

    public product(String id2, int code2){
        this.id2 = id2;
        this.code2 = code2;
    }
}