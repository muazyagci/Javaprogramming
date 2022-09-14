package day50_Collection;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

       // names.removeIf(each -> each.equalsIgnoreCase("ahmed"));
//
        //System.out.println(names);

 /*       for (Iterator<String> i= names.iterator(); i.hasNext();){
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names);

  */

      /*  Iterator<String> i= names.iterator();
        while (i.hasNext()){
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names);

       */

       /* for (Iterator<String> i= names.iterator();i.hasNext();){
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }

        System.out.println(names);


       */

        names.removeIf(each-> each.equalsIgnoreCase("ahmed"));

        System.out.println(names);

    }

}
