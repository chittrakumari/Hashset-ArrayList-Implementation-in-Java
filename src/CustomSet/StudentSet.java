/**
 * Creating a Set to store student objects.
 * We need a Student class
 */


package CustomSet;
import java.util.*;
public class StudentSet {

        public static void main(String[] args) {
            Set<StudentClass> studentSet = new HashSet<>();
            StudentClass s1 = new StudentClass();
            s1.setRollNo(11);
            s1.setName("Ramesh");
            StudentClass s2 = new StudentClass();
            s2.setRollNo(12);
            s2.setName("Vikas");
            StudentClass s3 = new StudentClass();
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

