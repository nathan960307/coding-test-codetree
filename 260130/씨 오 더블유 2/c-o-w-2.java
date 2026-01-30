import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 문자열의 길이
        String str = sc.next();
        int len = str.length();
        int answer = 0;

        for(int i=0; i<len-2; i++){
            if(str.charAt(i) != 'C'){
                continue;
            } 
            for(int j=i+1; j<len-1; j++){
                if(str.charAt(j) != 'O'){
                continue;
                } 
                for(int k=j+1; k<len; k++){
                    if(str.charAt(k) != 'W'){
                    continue;
                    } 
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}