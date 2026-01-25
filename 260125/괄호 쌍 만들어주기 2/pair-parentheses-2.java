import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // (,) 로만 이루어
        // Please write your code here.
        int len = input.length();
        int answer = 0;

        for(int i=0; i<len-1; i++){
            for(int j=i+2; j<len-1; j++){
                int char1 = input.charAt(i);
                int char2 = input.charAt(i+1);
                int char3 = input.charAt(j);
                int char4 = input.charAt(j+1);

                if(char1 == '(' && char2 == '('){ // 여는 괄호인 경우
                    if(char3 == ')' && char4 == ')'){
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