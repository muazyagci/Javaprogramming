package day49_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println("------------------------------");
        Set<Integer> hashSet1=new HashSet<>();
        hashSet1.addAll(Arrays.asList(10,200,300,40,90));
        hashSet1.addAll(Arrays.asList(10,200,300,40,90));
        hashSet1.addAll(Arrays.asList(10,200,300,40,90));
        hashSet1.addAll(Arrays.asList(10,200,300,40,90));
        hashSet1.addAll(Arrays.asList(10,200,300,40,90));
        hashSet1.addAll(Arrays.asList(null,null,null,null));



        System.out.println(hashSet1);


        Set<Integer> linkedHashSet1=new LinkedHashSet<>();
        linkedHashSet1.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet1.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet1.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet1.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet1.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet1.addAll(Arrays.asList(null,null,null,null));

        System.out.println("linkedHashSet1 = " + linkedHashSet1);

        Set<Integer> treeSet1=new TreeSet<>();
        treeSet1.addAll(Arrays.asList(10,200,300,40,90));
        treeSet1.addAll(Arrays.asList(10,200,300,40,90));
        treeSet1.addAll(Arrays.asList(10,200,300,40,90));
        treeSet1.addAll(Arrays.asList(10,200,300,40,90));
        treeSet1.addAll(Arrays.asList(10,200,300,40,90));
        treeSet1.addAll(Arrays.asList(null,null,null,null));

        System.out.println("treeSet1 = " + treeSet1);

    }
}
