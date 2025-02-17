package csc223.sb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    
    @Test
    void testInsert(){
        BinaryTree tree = new BinaryTree();
        tree.insert('A');
        assertEquals('A', tree.root.data);


        tree.insert('B');
        
    }
}
