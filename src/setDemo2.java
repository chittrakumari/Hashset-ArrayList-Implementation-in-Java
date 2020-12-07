//Demonstrating set operation UNION.


import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class setDemo2 {
    public static void main(String[] args){
        Random r=new Random();
    Set<Integer> set1=new HashSet<>();
    Set<Integer> set2=new HashSet<>();
        for (int i = 0; i <5 ; i++) {
            set1.add(r.nextInt(100));
            set2.add(r.nextInt(100));

        }
        System.out.println(set1);
        System.out.println(set2);
        
        //union
    Set<Integer> union=new HashSet<>();
        union.addAll(set2);
        union.addAll(set1);
        System.out.println(union);

    }
}
