import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            students[i] = new Student(height[i],weight[i],i+1);
        }
        // Please write your code here.
        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s.height + " " + s.weight + " " + s.num);
        }

        

    }
}

class Student implements Comparable<Student> {
        int height;
        int weight;
        int num;

        Student(int height, int weight, int num) {
            this.height = height;
            this.weight = weight;
            this.num = num;
        }

        @Override
        public int compareTo(Student o) {
            if(this.height == o.height){
                if(o.weight == this.weight){
                    return this.num - o.num;
                }
                return o.weight - this.weight;
            }
            return o.height - this.height; // 키 기준 오름차순
            
        }
};

