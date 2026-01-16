import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000001];
        int[] b = new int[1000001];
        int n = sc.nextInt(); // a가 이동하는 횟수
        int m = sc.nextInt(); // b가 이동하는 횟수
        int a_index = 0;
        int a_time = 0;
        int b_index = 0;
        int b_time = 0;

        for(int i=0; i<n; i++){
            char d = sc.next().charAt(0); // 'L' , 'R'
            int t = sc.nextInt();

            for(int j=0; j<t; j++){
                a_time++;
                if(d=='L'){
                    a_index--;
                }else if(d=='R'){
                    a_index++;
                }

                a[a_time] = a_index;
            }

        }

        for(int i=0; i<m; i++){
            char d = sc.next().charAt(0); // 'L' , 'R'
            int t = sc.nextInt();

            for(int j=0; j<t; j++){
                b_time++;
                if(d=='L'){
                    b_index--;
                }else if(d=='R'){
                    b_index++;
                }

                b[b_time] = b_index;
            }

        }
        int answer = -1;
        for(int i=1; i<a_time; i++){
            if(a[i]==b[i]){
                answer = i;
                break;
            }
        }
        System.out.print(answer);

        
        
        
    }
}