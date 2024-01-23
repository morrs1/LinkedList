package linkedList;

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
        singleLinkedList.add(2,9);
        singleLinkedList.add(2,0);
        System.out.println(singleLinkedList);
        singleLinkedList.removeAll(9);
        System.out.println(singleLinkedList);


//        for(var e: singleLinkedList){
//            System.out.println(e);
//        }
    }
}