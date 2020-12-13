/**
 * Question: Create a list of Student object, add 5 elements in the list.
 * Sort it on the basis of first on rollNo,
 * then sort the list by Name;
 * Student class contains two fields rollNo & Name;
 * hint: Comparable<T></> and Comparator<T> with lambda expression
 */


package CustomList;

import java.util.*;


public class StudentList {
    public static void main(String[] args) {
        List<StudentClass> l=new ArrayList<>();
        for (int i=0;i<3;i++) {
            StudentClass s = new StudentClass();
            Scanner sc = new Scanner(System.in);
            int r=sc.nextInt();
            s.setRollNo(r);
            sc.nextLine();
            String n=sc.nextLine();
            s.setName(n);
            l.add(s);
        }

        //SORTING WITH THE HELP OF COMPARABLE ON THE BASIS OF NAME.

        /*Comaparable is a functional interface having one abstract method i.e compareTo.
        For implementing collections.sort() method we need to implement Comparable interface in our class
       and override compareTo method as per our use case*/

        Collections.sort(l);// To use Comparable interface ,in our class we need to implement
                            // Comparable interface and override compare method as per our use case

        //Printing elements after sorting the list on the basis of name.
        System.out.println(l);








       //SORTING WITH THE HELP OF COMPARATOR ON THE BASIS OF ROLL NUMBER.

        /*Comaparator is a functional interface having one abstract method i.e compare.
        For implementing listname.sort() method we need to implement Comparator interface in our class
       and override compare method as per our use case*/

        l.sort(new StudentClass());/*or if we want to sort using listName.sort() method we need to pass the refernce
                                    of StudentClass() like we did for l.sort() method.*/








        /*or if we want to sort using Collections.sort() method we need to pass the refernce of StudentClass() like
        we did for l.sort() method.*/
        StudentClass s =new StudentClass();
        Collections.sort(l,s);

        //Printing elements after sorting the list on the basis of Roll number.
        System.out.println(l);






        //IMPLEMENTING COMPARATOR INTERFACE WITH LAMBDA EXPRESSIONS.

        //SORTING WITH THE HELP OF COMPARATOR ON THE BASIS OF ROLL NUMBER.
        Comparator<StudentClass> comp=(o1, o2) -> {
            return o1.getRollNo()- o2.getRollNo();
        };
        l.sort(comp);
        System.out.println(l);

    }
}
