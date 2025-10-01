import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.startsWith(t)) {
                result.add(word);
            }
        }

        Collections.sort(result);

        System.out.println(result.get(k-1));
    }
}