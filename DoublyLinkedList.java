package csc223.sb;

public class DoublyLinkedList extends SinglyLinkedList{
    
    Node tail;

    public DoublyLinkedList(){
        super();
        this.tail = null;
    }


    // Insert an item at the end of the list for unsorted lists
    @Override
    public void insert(char item){
        Node new_node = new Node(item);
        if (head == null){
            head = new_node;
            tail = new_node;
        } else{
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
        size ++;
    }


    // Removes an item from the list
    @Override
    public void remove(char item){

        Node current = head;
        while (current != null){
            if (current.data == item){
                if (current.prev != null){
                    current.prev.next = current.next;
                } else{
                    head = current.next;
                }
                if (current.next != null){
                    current.next.prev = current.prev;
                } else{
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    // Reverse the list
    @Override
    public void reverse(){
        Node current = head;
        Node temp = null;
        tail = head;

        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null){
            head = temp.prev;
        }
    }

}
