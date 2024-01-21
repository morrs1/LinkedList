package linkedList;

public class Main {
    public static void main(String[] args) {
        var singleLinkedList = new SingleLinkedList<Integer>();
        for (var i = 0; i < 10; i++) {
            singleLinkedList.add(i);
        }

        System.out.println(singleLinkedList.get(9));
        System.out.println(singleLinkedList);
    }
}