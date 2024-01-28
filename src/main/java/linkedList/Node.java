package linkedList;

@SuppressWarnings("unused")
public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    T data;
    Node<T> prev;
    Node<T> next;

    /**
     * Конструктор класса, который создает элемент списка
     *
     * @param data Дата, которую будет хранить этот элемент
     * @param prev Ссылка на предыдущий элемент
     * @param next Ссылка на следующий элемент
     */
    public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }


    /**
     * Метод, сравнивающий два элемента
     *
     * @param o элемент для сравнения.
     * @return Возвращает 0 если элементы равны, 1, если первый больше второго, -1, если второй больше первого
     *<Li>Node(-5).compareTo(Node(-5)) => 0;</Li>
     * <Li>Node(-5).compareTo(Node(15)) => -1;</Li>
     * <Li>Node(-5).compareTo(Node(-16)) => 1;</Li>
     */
    @Override
    public int compareTo(Node<T> o) {
        return this.data.compareTo(o.data);
    }
}
