package csc223.sb;

public class SinglyLinkedList implements LinkedList{

    Node head;
    int size;

    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;

    }


    // Insert an item at the end of the list for unsorted lists
    @Override
    public void insert(char item){
        
        Node new_node = new Node(item);

        // check if list is empty
        if (head == null) {
            head = new_node;
        } 
        // find the last node and insert
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
        // increment size
        size++;
    }


    // Removes an item from the list
    @Override
    public void remove(char item){

        //check if list is empty
        if (head == null){
            return;
        }
        // check if head is target and remove
        if (head.data == item) {
            head = head.next;
            size--;
            return;
        }
        
        // find the node
        Node current = head;
        while (current.next != null && current.next.data != item) {
            current = current.next;
        }
        // if found remove it
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }
    

    // Get the first item, return '☠' if the list is empty
    @Override
    public char getFirst(){
        return head == null ? '☠' : head.data;
    }

    // Get the last item, return '☠' if the list is empty
    @Override
    public char getLast(){
        // list is empty
        if (head == null){
            return '☠';
        }

        Node current = head;
        // go to last node
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }

    // Get an item at a specific index, return '☠' if index is out of bounds
    @Override
    public char get(int index){

        // check for invalid index
        if (index < 0 || index >= size){
            return '☠';
        }
        Node current = head;
        // go to target index
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }


    // Get the size of the list
    @Override
    public int size(){
        return size;
    }


    // Check if the list is empty
    @Override
    public boolean isEmpty(){
        return size == 0;
    }


    // Clear the list
    @Override
    public void clear(){
        head = null;
        size = 0;
    }

    // Check if the list contains an item
    @Override
    public boolean contains(char item){
        
        Node current = head;
        // search for target item and return true if found
        while (current != null) {
            if (current.data == item){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    // Get the index of an item, if it exists else return -1
    @Override
    public int indexOf(char item){

        Node current = head;
        int index = 0;
        // search for target item and its index
        while (current != null) {
            if (current.data == item){
                return index;
            } 
            current = current.next;
            index++;
        }
        return -1;
    }


    // Get the last index of an item, if it exists else return -1
    @Override
    public int lastIndexOf(char item){

        Node current = head;
        int index = 0;
        int last_index = -1;

        while (current != null){
            if (current.data == item){
                last_index = index;
            }
            current = current.next;
            index ++;
        }
        return last_index;
    }


    // Reverse the list
    @Override
    public void reverse(){

        Node prev = null;
        Node current = head;
        Node next;
        
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    // Creates and returns a String representation of the list
    // e.g. `A -> B -> C -> D` should return "ABCD"
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null){
            sb.append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
    }

