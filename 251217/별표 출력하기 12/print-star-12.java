import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2;
        int space = n;

        for(int i =1; i<=n; i++){ // 가로
            for(int j=1; j<=n; j++){ // 세로

                if(j%2!=0 && i==1) { // 첫번째 줄이면서 홀수인 경우
                    System.out.print("* "); 
                }else if(j%2!=0 && i !=1){ // 첫번째 줄이 아니면서 홀수인 경우
                    System.out.print("  ");
                }else if(j%2==0 && (j>=i || i ==1)){ // 짝수인경우
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    
}
}