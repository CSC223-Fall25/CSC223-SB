package csc223.sb;

public class ArrayQueue implements Fuber.Queue{
    int[] data;
    int curr;
    int capacity;
    int size;

    public void Queue(){
        this.capacity = 10;
        this.data = new int[this.capacity];
        this.curr = 0;
        this.size = 0;
    }
    @Override
    public void enqueue(int item){
        //check if queue is full
        if (this.size == this.capacity){
            System.out.println("Queue is at capacity.");
        }else{
            // add item to queue 
            this.data[this.curr] = item;
            // increment curr and size
            this.curr++;
            this.size++;
        }
    }
    @Override
    public int dequeue(){
        //check if queue is empty
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            //remove item from front of the queue
            int return_val = peek();
            //decrement curr
            this.curr--;

            return return_val;
        }
    }
    @Override
    public int peek(){
        //check if empty 
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            //returns value at front of the queue
            return this.data[0];
        }
    }
    @Override
    public boolean isEmpty(){
        return this.size == 0;

    }
    @Override
    public int size(){
        return this.size;

    }
}
