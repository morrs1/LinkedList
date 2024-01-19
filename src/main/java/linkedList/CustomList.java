package linkedList;

import java.util.Collection;

public interface CustomList<T> {
    /**
     * Метод добавления элемента в конец списка
     * @param obj элемент, который мы хотим добавить в список
     */
    void add(T obj);

    /**
     * Метод вставки элемента в список
     * @param obj элемент, который мы хотим вставить в список на заданную позицию
     * @param index индекс, по которому осуществится вставка
     */

    void add(T obj, int index);

    /**
     * Удаление всех элементов списка
     */
    void clear();

    int size();
    boolean remove(T obj);
    boolean remove(int index);
    boolean removeFirst();
    boolean removeLast();
    boolean removeAll(T...arr);
    boolean replace(T...args);
    boolean isSymmetry();

    boolean isEmpty();
    int indexOf(T obj);
    T find(int index);
}
