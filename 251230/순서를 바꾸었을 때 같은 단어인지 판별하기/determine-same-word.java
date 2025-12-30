import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String answer = "Yes";

        if(word1.length() != word2.length()){
            System.out.print("No");
            return;
        }

        for(int i=0; i<word1.length(); i++){
            if(arr1[i]!=arr2[i]){
                answer = "No";
                break;
            }
        }

        System.out.print(answer);


    }
}