package linkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var singleLinkedList = new SingleLinkedList<Integer>();


        for (var i = 1; i < 10; i++) {
            singleLinkedList.add(i);
        }
//        singleLinkedList.add(99, 9);
//        for (var i = 0; i < 10; i++) {
//            singleLinkedList.add(i * 10);
//        }
//        singleLinkedList.delLast();
//        singleLinkedList.delLast();
//        singleLinkedList.add(888);
//        singleLinkedList.delFirst();
//        singleLinkedList.delFirst();
//        singleLinkedList.addFirst(999);


//        for (var e : singleLinkedList) {
//            System.out.println(e.toString());
//        }
//        System.out.println(singleLinkedList.get(9));
//        singleLinkedList.add(2,9);
//        singleLinkedList.add(2,0);
//        System.out.println(singleLinkedList);
//        singleLinkedList.removeAll(9);
//        singleLinkedList.add(100);
        System.out.println(singleLinkedList);
//        System.out.println(singleLinkedList.size());
        singleLinkedList.reversed();
        singleLinkedList.add(9, 3);
        System.out.println(singleLinkedList);
        singleLinkedList.dataSort();
        System.out.println(singleLinkedList);
//        for(var e: singleLinkedList){
//            System.out.println(e);
//        }
//        System.out.println();
//        var a = new ArrayList<>(List.of(5, 6));
//        var b = new ArrayList<>(List.of(7,8));
//        var A = a;
//        var B = A;
//        A = b;
//        System.out.println(A);
//        String n = new String("final");
//        char nn = 'v';



//        singleLinkedList.add(9);
//        singleLinkedList.add(9);
//        singleLinkedList.add(9);
        singleLinkedList.add(9);
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        System.out.println(singleLinkedList);
        System.out.println(singleLinkedList.countDistinct());
        singleLinkedList.distinct();
        System.out.println(singleLinkedList);
        singleLinkedList.add(9);
        singleLinkedList.add(9);
        singleLinkedList.add(9);
        singleLinkedList.add(9);
        singleLinkedList.add(9);
        singleLinkedList.add(9);
        System.out.println(singleLinkedList);
        singleLinkedList.replace(9, 100);
        System.out.println(singleLinkedList);
    }
}