import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[200];
        int index =0;

        while(true){
            String temp = sc.next();
            if(temp.equals("0")){
                break;
            }
            arr[index++]= temp;
        }

        System.out.println(index);

        for(int i=0; i<index; i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }


    }
}




