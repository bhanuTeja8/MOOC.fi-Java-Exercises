
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {
    public static void  combine(ArrayList<Integer> first, ArrayList<Integer> second){
        first.addAll(second);

    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        
         list1.add(4);
         list1.add(3);


        Collections.addAll(list2, 5, 10, 7);
        
        list2.add(5);
        list2.add(10);
        list2.add(7);

       
        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);


    }

}