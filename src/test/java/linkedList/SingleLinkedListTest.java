package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest {
    SingleLinkedList<Integer> singleLinkedList;

    @BeforeEach
    void setUp() {
        singleLinkedList = new SingleLinkedList<>();
        for (var i = 0; i < 10; i++) {
            singleLinkedList.add(i);
        }
    }

    @Test
    void add_whenAddEleven_thenLastMustBeEleven() {
        singleLinkedList.add(11);
        var result = singleLinkedList.get(11);
        assertEquals(11, result);
    }

    @Test
    void testAdd() {

    }

    @Test
    void clear() {

    }

    @Test
    void size() {
        var result = singleLinkedList.size();
        var expected = 10;
        assertEquals(expected, result);
    }

    @Test
    void remove() {

    }

    @Test
    void testRemove() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void replace() {
    }

    @Test
    void isSymmetry() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void get() {
    }

    @Test
    void checkSorted() {
    }

    @Test
    void countDistinct() {
    }

    @Test
    void distinct() {
    }

    @Test
    void reversed() {
    }

    @Test
    void sort() {
    }

    @Test
    void max() {
    }

    @Test
    void min() {
    }
}