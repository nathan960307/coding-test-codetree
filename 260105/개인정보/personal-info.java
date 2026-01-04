import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Student[] Students = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            Students[i] = new Student(names[i],heights[i],weights[i] );
        }
        // Please write your code here.


        Arrays.sort(Students,(a,b)->a.name.compareTo(b.name));

        System.out.println("name");
        
        for (Student s : Students) {
            System.out.printf("%s %d %.1f \n", s.name, s.height, s.weight);
        }

        System.out.println("");

        Arrays.sort(Students);

        System.out.println("height");
        
        for (Student s : Students) {
            System.out.printf("%s %d %.1f \n", s.name, s.height, s.weight);
        }



    }
}

class Student implements Comparable<Student> {
        String name;
        int height;
        double weight;

        Student(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Student o) {
            return o.height - this.height; 
            
        }
};