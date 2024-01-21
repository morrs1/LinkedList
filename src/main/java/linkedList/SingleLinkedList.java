package linkedList;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SingleLinkedList<T extends Comparable<T>> implements CustomList<T>, Iterable<T> {
    private int size;
    Node<T> head;
    Node<T> tail;

    public SingleLinkedList() {
        this.size = 0;
        this.head = this.tail = null;
    }


    public SingleLinkedList(@NotNull Collection<T> collection) {
        this.size = collection.size();
    }


    @Override
    public boolean add(T obj) {
        if (size == 0) {
            head = new Node<>(obj, null);
            tail = head;
            size++;
            return true;
        }
        if (size > 0) {
            var secondLast = tail;
            tail = new Node<>(obj, null);
            secondLast.next = tail;
            size++;
            return true;
        }
        return true;
    }

    @Override
    public void add(T obj, int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> collection) {
        return false;
    }

    @Override
    public void replace(T obj) {

    }

    @Override
    public boolean isSymmetry() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public boolean checkSorted() {
        return false;
    }

    @Override
    public int countDistinct() {
        return 0;
    }

    @Override
    public CustomList<T> distinct() {
        return null;
    }

    @Override
    public CustomList<T> reversed() {
        return null;
    }

    @Override
    public CustomList<T> sort(String key) {
        return null;
    }

    @Override
    public T max() {
        return null;
    }

    @Override
    public T min() {
        return null;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    public String toString() {
        var curr = head;
        StringBuilder str = new StringBuilder();
        while (curr != null) {
            str.append(curr.data).append(" ");
            curr = curr.next;
        }
        return str.toString();
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        var node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
