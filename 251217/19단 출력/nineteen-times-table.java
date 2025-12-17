import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 1; i <= 19; i++) { // 가로
                for (int j = 1; j <=19; j++) { //세로 (별)
                    
                    System.out.printf("%d * %d = %d",i,j,i*j);

                    if(j%2==0 || j==19 ){
                        System.out.println("");
                    }else if(j%2!=0 ){
                        System.out.print(" / ");
                    }
                }
        }
    }
}
