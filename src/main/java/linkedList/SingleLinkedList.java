package linkedList;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class SingleLinkedList<T extends Comparable<T>> implements CustomList<T>, Iterable<T> {

  private int size;
  Node<T> head;
  Node<T> tail;

  public SingleLinkedList() {
    this.size = 0;
    this.head = this.tail = null;
  }

  @Override
  public void addFirst(T obj) {
    var node = new Node<>(obj, null);
    if (size == 0) {
      head = tail = node;
    } else {
      node.next = head;
      head = node;
    }

    size++;
  }

  @SuppressWarnings("unused")
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
    if (index == 0) {
      addFirst(obj);
      return;
    }
    if (index == size) {
      add(obj);
      return;
    }
    var node = new Node<>(obj, null);
    var prev = getNode(index - 1);

    node.next = prev.next;
    prev.next = node;
    size++;
  }

  @Override
  public void clear() {
    head = tail = null;
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public T delLast() {
    var buff = getNode(size - 1);
    tail = getNode(size - 2);
    tail.next = null;
    size--;
    return buff.data;
  }

  @Override
  public T delFirst() {
    var buffNode = head;
    head = buffNode.next;
    buffNode.next = null;
    size--;
    return buffNode.data;
  }

  @Override
  public void remove(Object obj) {
    int index = indexOf(obj);
    if (index != -1) {
      remove(index);
    }
  }

  @Override
  public void removeAll(Object object) {
    Node<T> current = head;
    Node<T> prev = null;

    while (current != null) {
      if (current.data.equals(object)) {
        if (prev == null) {
          head = current.next;
        } else {
          prev.next = current.next;
        }
        size--;
      } else {
        prev = current;
      }
      current = current.next;
    }
  }


  @Override
  public T remove(int index) {
    if (index == 0) {
      return delFirst();
    }
    if (index == size - 1) {
      return delLast();
    }

    var prevNode = getNode(index - 1);
    var node = getNode(index);
    prevNode.next = node.next;
    node.next = null;

    size--;
    return node.data;
  }


  @Override
  public void replace(T obj, T replaceObj) {
    while (this.indexOf(obj) != -1){
      var i = this.indexOf(obj);
      this.getNode(i).data = replaceObj;
    }
  }

  @Override
  public boolean isSymmetry() {
    return false;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int indexOf(Object obj) {
    var node = head;
    for (int i = 0; i < size; i++) {
      if (node.data.equals(obj)) {
        return i;
      }
      node = node.next;
    }
    return -1;
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
    var hashSet = new HashSet<>();
    for (var node : this) {
      hashSet.add(node);
    }
    return hashSet.size();
  }

  @Override
  public CustomList<T> distinctNew() {

    var linkedHashSet = new LinkedHashSet<T>();
    for (var node : this) {
      linkedHashSet.add(node);
    }

    var singleLinkedList = new SingleLinkedList<T>();
    linkedHashSet.forEach(singleLinkedList::add);

    return singleLinkedList;
  }

  public void distinct() {
    var linkedHashSet = new LinkedHashSet<T>();
    for (var node : this) {
      linkedHashSet.add(node);
    }

    this.clear();
    linkedHashSet.forEach(this::add);
  }

  @Override
  public void reversed() {
    var left = head;
    var right = tail;
    var prevLeft = head;
    var prevRight = getNode(size - 2);
    for (var i = 0; i < Math.floorDiv(size, 2); i++) {
      if (i == 0) {
        prevRight.next = left;
        right.next = left.next;
        left.next = null;
        head = right;
        tail = left;
        left = right.next;
        right = getNode(size - 2);
      } else {
        prevLeft = getNode(i - 1);
        prevRight = getNode(size - i - 2); //-2
        var nextLeft = left.next;
        var nextRight = right.next;
        prevRight.next = left;
        right.next = nextLeft;
        left.next = nextRight;
        prevLeft.next = right;
        left = right.next;
        right = getNode(size - i - 2);


      }
    }

  }

  @Override
  public T max() {
    var biggestNode = this.head;
    var nodeForCycle = this.head;

    for (int i = 0; i < this.size; i++) {

      if (nodeForCycle.compareTo(biggestNode) > 0) {
        biggestNode = nodeForCycle;
      }

      nodeForCycle = nodeForCycle.next;
    }

    return biggestNode.data;
  }


  @Override
  public T min() {
    var minimalNode = this.head;
    var nodeForCycle = this.head;

    for (int i = 0; i < this.size; i++) {

      if (nodeForCycle.compareTo(minimalNode) < 0) {
        minimalNode = nodeForCycle;
      }

      nodeForCycle = nodeForCycle.next;
    }

    return minimalNode.data;
  }

  @NotNull
  @Override
  public Iterator<T> iterator() {
    return new Iterator<>() {

      private Node<T> node = head;

      @Override
      public boolean hasNext() {
        return node != null;
      }

      @Override
      public T next() {
        T obj = node.data;
        node = node.next;
        return obj;
      }
    };
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

  private void swap(Node<T> ptr1, Node<T> ptr2) {
    T tmp = ptr2.data;
    ptr2.data = ptr1.data;
    ptr1.data = tmp;
  }

  public void dataSort() {
    boolean swapped;
    Node<T> current;

    if (head == null) {
      return;
    }

    do {
      swapped = false;
      current = head;

      while (current.next != null) {
        if (current.data.compareTo(current.next.data) > 0) {
          swap(current, current.next);
          swapped = true;
        }
        current = current.next;
      }
    } while (swapped);
  }

  public void pointerSort() {
    Node<T> dummyNode = new Node<>(null, null);
    Node<T> currentNode = head;

    while (currentNode != null) {
      Node<T> insertCurrentPos = dummyNode.next;
      Node<T> insertPrePos = null;

      while (insertCurrentPos != null) {
        if (insertCurrentPos.data.compareTo(currentNode.data) > 0) {
          break;
        }

        insertPrePos = insertCurrentPos;
        insertCurrentPos = insertCurrentPos.next;
      }

      if (insertPrePos == null) {
        insertPrePos = dummyNode;
      }

      Node<T> tempNode = currentNode.next;

      currentNode.next = insertPrePos.next;
      insertPrePos.next = currentNode;

      currentNode = tempNode;
    }

    this.head = dummyNode.next;
    var curr = this.head;
    while (curr.next != null) {
      curr = curr.next;
    }
    this.tail = curr;
  }


}
