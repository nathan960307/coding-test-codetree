import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] Students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            Students[i] = new Student(name,height,weight);
        }

        Arrays.sort(Students);
        
        for (Student s : Students) {
            System.out.printf("%s %d %d \n", s.name, s.height, s.weight);
        }
    }
}


class Student implements Comparable<Student> {
        String name;
        int height;
        int weight;

        Student(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Student o) {
            if(this.height == o.height){
                return o.weight - this.weight;
            }
            return this.height - o.height; // 키 기준 오름차순
            
        }
};