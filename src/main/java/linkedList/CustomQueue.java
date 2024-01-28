package linkedList;

public interface CustomQueue<T> {
    /**
     * Метод, добавляющий элемент в конец списка
     *
     * @param obj Объект, который будет добавлен
     */
    @SuppressWarnings("UnusedReturnValue")
    boolean add(T obj);

    /**
     * Метод, удаляющий элемент из начала списка
     *
     * @return Возвращает удаленный элемент
     */

    T delFirst();
}
