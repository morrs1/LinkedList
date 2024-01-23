package linkedList;

public interface CustomQueue<T> {
    /**
     * Метод, добавляющий элемент в конец списка
     *
     * @param obj Объект, который будет добавлен
     */
    boolean add(T obj);

    /**
     * Метод, удаляющий элемент из начала списка
     *
     * @return
     */

    T delFirst();
}
