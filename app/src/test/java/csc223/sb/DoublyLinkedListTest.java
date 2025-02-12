package csc223.sb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {
    @Test
    void testInsert(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert('S');
        dll.insert('B');
        dll.insert('A');

        assertEquals(3, dll.size());

        dll.insert('R');
        assertEquals(4, dll.size());
        assertEquals('S', dll.getFirst());
        assertEquals('R', dll.getLast());
    }

    @Test
    void testRemove(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert('S');
        dll.insert('B');
        dll.insert('A');

        assertTrue(dll.contains('B'));
        dll.remove('B');
        assertFalse(dll.contains('B'));
        assertEquals(2, dll.size());
    }

    @Test
    void testReverse(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert('A');
        dll.insert('B');
        dll.insert('C');

        dll.reverse();
        assertEquals('C', dll.getFirst());
        assertEquals('A', dll.getLast());
        assertEquals("CBA", dll.toString());

        dll.reverse();
        assertEquals('A', dll.getFirst());
        assertEquals('C', dll.getLast());
        assertEquals("ABC", dll.toString());
    }
}
