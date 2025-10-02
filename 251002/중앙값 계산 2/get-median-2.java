import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int[] arr = new int[n];
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
            
           
            if (i % 2 == 0) {
                List<Integer> temp = new ArrayList<>(list);
                Collections.sort(temp);
                
                int mid = temp.size() / 2;
                System.out.print(temp.get(mid) + " ");
            }
        }
    }
}
