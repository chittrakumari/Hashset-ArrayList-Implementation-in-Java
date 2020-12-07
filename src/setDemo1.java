//Creating a set which can hold integer objects using HashSet class.

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class setDemo1 {
    public static void main(String[] args){

        //creating a set
        HashSet<Integer> set= new HashSet<>();

        //It can also be created by set's reference,HashSet's Object.
        Set<Integer> set1=new HashSet<>();

        //add method
        set.add(10);

        System.out.println(set.add(Integer.valueOf(23))); //This function set.add() returns true if the value is not duplicate.

        System.out.println(set.add(23));                  //set.add() returns false if the value is duplicate.

        System.out.println("set:"+set);

        //addAll Method demonstration using ArrayList.

        //Creating an array list
        ArrayList<Integer> list=new ArrayList<>();

        //adding random values from random class
        Random r=new Random();
        for (int i=0;i<10;i++){
            list.add(r.nextInt(100));
        }

        set.addAll(list);
        System.out.println("set : "+set);

        //remove method.
        System.out.println(set.remove(23));       //set.remove() returns true if the value is there in the set.

        System.out.println(set.remove("hello"));   //set.remove returns false if the value is not there in the set.

        System.out.println("set : "+set);
    }
}
