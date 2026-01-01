import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static class Person {
        String name;
        int height;
        int weight;

        Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Person(name, height, weight);
        }

        Arrays.sort(arr, (a, b) -> a.height - b.height);

        for (Person p : arr) {
            System.out.println(p.name + " " + p.height + " " + p.weight);
        }
    }
}
