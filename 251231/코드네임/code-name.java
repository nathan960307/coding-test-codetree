import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        agent[] agents = new agent[5];
        for(int i = 0; i < 5; i++) {
            char code = sc.next().charAt(0);
            int score = sc.nextInt();
            agents[i] = new agent(code, score);
        }


        int min = 100;
        char answer = ' ';

        for(int i = 0; i < 5; i++) {
            if(agents[i].score <= min){
                min = agents[i].score;
                answer = agents[i].code;
            }
        }

        System.out.print(answer + " " + min);


    }
}

class agent {
    char code;
    int score;

    public agent(char code, int score){
        this.code = code;
        this.score = score;
    }
};


