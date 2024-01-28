package linkedList;

@SuppressWarnings({"unused","UnusedReturnValue"})
public interface CustomList<T> extends CustomQueue<T> {


    /**
     * Метод вставки элемента в список
     *
     * @param obj   элемент, который мы хотим вставить в список на заданную позицию
     * @param index индекс, по которому осуществится вставка
     */

    void add(T obj, int index);

    /**
     * Удаление всех элементов списка
     */
    void clear();

    /**
     * Метод, который возвращает кол-во элементов списка
     *
     * @return Возвращает кол-во элементов списка
     */
    int size();

    /**
     * Метод для удаления заданного элемента из списка
     *
     * @param obj Удаляемый элемент
     */
    void remove(Object obj);

    /**
     * Метод для удаления элемента из списка по заданному индексу
     *
     * @param index - индекс, по которому происходит удаление элемента
     * @return Возвращает true, если удаление прошло успешно, в ином случае false
     */
    T remove(int index);

    /**
     * Метод для удаления элементов из списка, которые были переданы в качестве параметров
     *
     * @param obj Элемент, который будет удален из списка
     */
    void removeAll(Object obj);

    /**
     * - изменение всех элементов списка с данным значением на новое.
     *
     * @param replaceObj элемент из списка, который мы хотим заменить на новое.
     * @param Obj значение, на которое будет изменено значение replaceObj
     */
    void replace(T replaceObj, T Obj);

    /**
     * Метод, который проверяет симметричен ли список
     *
     * @return Возвращает true, если список симметричен, в противном случае false
     */
    boolean isSymmetry();

    /**
     * Метод, определяющий пустой ли список
     *
     * @return Возвращает true если список пустой и false в противном случае
     */
    boolean isEmpty();

    /**
     * Метод, находящий заданный элемент в списке
     *
     * @param obj Объект, индекс которого нужно найти в списке
     * @return Возвращает индекс элемента, если он был найден, в противном случае -1
     */
    int indexOf(Object obj);

    /**
     * Метод, находящий элемент по заданному индексу
     *
     * @param index - индекс элемента, который нужно найти
     * @return Возвращает объект по заданному индексу
     */
    T get(int index);

    /**
     * Определение, можно ли удалить из списка каких-нибудь два элемента так, чтобы новый список оказался упорядоченным.
     *
     * @return определяет возможно ли такое...
     */
    boolean checkSorted();

    /**
     * Определение, сколько различных значений содержится в списке.
     *
     * @return возвращает целое число - количество различных элементов в списке.
     */
    int countDistinct();

    /**
     * Удаление из списка элементов, значения которых уже встречались в предыдущих элементах.
     *
     * @return возвращает новый список, где нет повторяющихся элементов.
     */
    CustomList<T> distinctNew();

    /**
     * - изменение порядка элементов на обратный.
     */
    void reversed();

    /**
     * Поиск наибольшего значения в списке
     *
     * @return возвращает максимальный элемент (значение) в списке.
     */
    T max();

    /**
     * Поиск наименьшего значения в списке.
     *
     * @return возвращает минимальный элемент (значение) в списке.
     */
    T min();

    /**
     * Метод, добавляющий элемент в начало списка
     *
     * @param obj Объект, который будет добавлен
     */
    void addFirst(T obj);

    T delLast();

}
