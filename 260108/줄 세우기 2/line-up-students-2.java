import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] Students = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Students[i] = new Student(i+1,height,weight);
        }
        // Please write your code here.


        Arrays.sort(Students);
        
        for (Student s : Students) {
            System.out.printf("%d %d %d \n", s.height, s.weight, s.seq);
        }

    }
}

class Student implements Comparable<Student> {
        int seq; // 순서
        int height; // 신장
        int weight; // 체중

        Student(int seq, int height, int weight) {
            this.seq = seq;
            this.height = height;
            this.weight = weight;
        }

        // 신장 - 오름차순
        // 신장 동일 - 체중 내림차순
        @Override
        public int compareTo(Student s) {
            if(this.height == s.height){
                return s.weight - this.weight; // 체중 내림차순
            }
            return this.height - s.height; // 신장 오름차순
            
        }
};