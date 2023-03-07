import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> link  = new LinkedList<String>();
        link.add("Edward");
        link.add("eric");
        link.add("kameme");

       // System.out.println(link); // tp print the whole list
       // System.out.println(link.remove()); //removes the first element always
       // System.out.println(link); // tp print the whole list
        //System.out.println(link); // tp print the whole list
        //System.out.println(link.get(1)); // to find a given object from the list

        //but if the arrayList is too large, we use iterator

        Iterator it = link.iterator();
        while(it.hasNext()){
            if ((String) it.next() == "eric"){
                System.out.println( "we found it");
            }
        }

    }
}