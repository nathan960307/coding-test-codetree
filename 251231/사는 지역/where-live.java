import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        String min = "";
        int index = 0;

        // Please write your code here.
        data[] datas = new data[n];

        for(int i = 0; i < n; i++) {
            datas[i] = new data(names[i],addresses[i],regions[i]);
        }

        for(int i = 0; i < n; i++) {
            if(datas[i].name.compareTo(min) >0){
                min = datas[i].name;
                index = i;
            }
        }

        System.out.println("name " + datas[index].name);
        System.out.println("addr " + datas[index].address);
        System.out.println("city " + datas[index].region);
    }
}

class data {
    String name;
    String address;
    String region;

    public data(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }
};