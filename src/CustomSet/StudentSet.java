package CustomSet;
import java.util.*;
public class StudentSet {

        public static void main(String[] args) {
            Set<Student> studentSet = new HashSet<>();
            Student s1 = new Student();
            s1.setRollNo(11);
            s1.setName("Ramesh");
            Student s2 = new Student();
            s2.setRollNo(12);
            s2.setName("Vikas");
            Student s3 = new Student();
            s3.setRollNo(11);
            s3.setName("Ramesh");
            //adding student objects in set
            System.out.println(studentSet.add(s1));//hashcode is called
            System.out.println("S1 hashCode = "+s1.hashCode());
            System.out.println(studentSet.add(s2));//hashcode is called
            System.out.println("S2 hashCode = "+s2.hashCode());
            System.out.println(studentSet.add(s3));//hashcode is called
            System.out.println("S3 hashCode = "+s3.hashCode());
            //printing set
            System.out.println(studentSet);

        }
    }

