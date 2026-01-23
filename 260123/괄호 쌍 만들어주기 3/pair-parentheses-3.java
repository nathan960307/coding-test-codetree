import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// (,) 로만 이루어진 문자열
        // Please write your code here.
        int len = str.length();
        int answer = 0;

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                int char1 = str.charAt(i);
                int char2 = str.charAt(j);

                if(char1 == '('){ // 여는 괄호인 경우
                    if(char2 == ')'){
                        answer++;
                    }
                }else if(char1 == ')'){// 닫는 괄호 인 경우
                    break;
                }
            }
        }

        System.out.print(answer);
    }
}