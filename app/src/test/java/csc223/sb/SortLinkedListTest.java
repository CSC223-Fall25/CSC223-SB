package csc223.sb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SortLinkedListTest {
    
    @Test
    void testInsert(){
        SortedLinkedList sdll = new SortedLinkedList();
        sdll.insert('B');
        sdll.insert('C');
        sdll.insert('A');

        assertEquals("ABC", sdll.toString());

        sdll.insert('A');
        assertEquals("AABC", sdll.toString());
    }

    @Test
    void testRemove(){
        SortedLinkedList sdll = new SortedLinkedList();
        sdll.insert('B');
        sdll.insert('C');
        sdll.insert('A');

        assertEquals(3, sdll.size());
        sdll.remove('B');

        assertEquals("AC", sdll.toString());
    }
}
