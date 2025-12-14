import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int tens = 0; // 10의 자리
        int ones = 0; // 1의 자리
        int[] nums = {3,6,9};

        for(int i=1; i<=n; i++){

            tens = (i /10) % 10;
            ones = i % 10;

            if(i % 3 == 0 || ones == 3 || ones == 6 || ones == 9 || tens == 3 || tens == 6 || tens == 9 ){ // 3의 배수인 경우
                System.out.print(0 + " ");
            }else{
                System.out.print(i + " ");
            }

            // for(int num : nums){
            //     if(tens== num || ones == num){
            //         System.out.print(0 + " ");
            //         break;
            //     }
            // }

            // for(int num : nums){
            //     if(tens != num || ones != num){
                    
            //         break;
            //     }
            // }
            


        }

        

        
        
        
        
    }
}
