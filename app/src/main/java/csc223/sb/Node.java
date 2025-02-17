package csc223.sb;

public class Node {
    Node next;
    Node prev;
    char data;

    public Node(char item){
        this.data = item;
        this.next = null;
        this.prev = null;
    }
    public Node(){
        this.data = ' ';
    }
}
