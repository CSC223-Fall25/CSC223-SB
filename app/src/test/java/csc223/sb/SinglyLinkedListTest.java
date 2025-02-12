package csc223.sb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class SinglyLinkedListTest {
    
    @Test
    public void testinsert(){
        SinglyLinkedList sll = new SinglyLinkedList();
        // make sure there are no values in the linkedlist
        assertEquals(0, sll.size());
        sll.insert('A');
        assertEquals(1, sll.size());
        sll.insert('B');
        sll.insert('C');
        assertEquals(3, sll.size());
    }

    
    @Test
    public void testremove(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('A');
        sll.insert('V');
        assertEquals(2, sll.size());
        sll.remove('S');
        assertEquals(2, sll.size());
        sll.remove('A');
        assertEquals(1, sll.size());

    }
    
    @Test
    public void testgetFirst(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertEquals('☠', sll.getFirst());

        sll.insert('S');
        assertEquals('S', sll.getFirst());

        sll.insert('B');
        assertEquals('S', sll.getFirst());
    }
    
    @Test
    public void testgetLast(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertEquals('☠', sll.getLast());

        sll.insert('N');
        assertEquals('N', sll.getLast());

        sll.insert('P');
        assertEquals('P', sll.getLast());
    }

    @Test
    public void testget(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('E');
        sll.insert('W');
        sll.insert('S');
        sll.insert('B');
        sll.insert('P');

        assertEquals('E', sll.get(0));
        assertEquals('B', sll.get(3));

        assertEquals('☠', sll.get(-2));
        assertEquals('☠', sll.get(10));
    }

    @Test
    public void testsize(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertEquals(0, sll.size());

        sll.insert('S');
        assertEquals(1, sll.size());

        sll.insert('L');
        sll.insert('B');
        assertEquals(3, sll.size());

        sll.remove('B');
        assertEquals(2, sll.size());
    }

    @Test
    public void testisEmpty(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertTrue(sll.isEmpty());

        sll.insert('S');
        assertFalse(sll.isEmpty());

        sll.remove('S');
        assertTrue(sll.isEmpty());
    }

    @Test
    public void testclear(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('A');
        sll.insert('B');

        assertEquals(2, sll.size());

        sll.clear();
        assertEquals(0, sll.size());
        assertTrue(sll.isEmpty());
    }

    @Test
    public void testcontains(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('A');
        sll.insert('B');

        assertTrue(sll.contains('A'));
        assertTrue(sll.contains('B'));
        assertFalse(sll.contains('R'));
    }

    @Test
    public void testindexOf(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('T');
        sll.insert('W');
        sll.insert('S');
        sll.insert('B');
        sll.insert('W');

        assertEquals(1, sll.indexOf('W'));
        assertEquals(0, sll.indexOf('T'));
        assertEquals(-1, sll.indexOf('A'));
    }

    @Test 
    public void testlastIndexOf(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('C');
        sll.insert('W');
        sll.insert('N');
        sll.insert('B');
        sll.insert('C');

        assertEquals(4, sll.lastIndexOf('C'));
        assertEquals(2, sll.lastIndexOf('N'));
        assertEquals(-1, sll.lastIndexOf('S'));

    }

    @Test 
    public void testreverse(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert('A');
        sll.insert('B');
        sll.insert('C');

        sll.reverse();
        assertEquals('C', sll.getFirst());
        assertEquals('A', sll.getLast());
        assertEquals("CBA", sll.toString());

        sll.reverse();
        assertEquals('A', sll.getFirst());
        assertEquals('C', sll.getLast());
        assertEquals("ABC", sll.toString());
    }

    @Test
    public void testtoString(){
        SinglyLinkedList sll = new SinglyLinkedList();
        assertEquals("", sll.toString());

        sll.insert('A');
        assertEquals("A", sll.toString());

        sll.insert('B');
        sll.insert('C');
        assertEquals("ABC", sll.toString());
    }
    
}
