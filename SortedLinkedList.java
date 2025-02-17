package csc223.sb;

public class SortedLinkedList extends DoublyLinkedList {
    

    public SortedLinkedList(){
        super();
    }

    // Insert an item to maintain sorted order
    @Override
    public void insert(char item){
        
        Node new_node = new Node(item);

        // check for empty list
        if (head == null) {
            super.insert(item);
            return;
        } 
        
        Node current = head;
        Node previous = null;

        // find position to insert
        while (current != null && current.data < item){
            previous = current;
            current = current.next;
        }

        // check if insertion at begining (head position)
        if (previous == null){
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        } 
        // insert middle or end
        else{
            new_node.next = current;
            new_node.prev = previous;
            previous.next = new_node;
            
            // check if node is not inserted at the end
            if (current != null){
                current.prev = new_node;
            } else{
                tail = new_node;
            }
        }
        size ++;
    }

    
    // override reverse and raise throw exception
    @Override
    public void reverse(){
        throw new UnsupportedOperationException("List is sorted - cannot reverse");
    }
}
