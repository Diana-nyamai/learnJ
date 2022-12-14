package datastructures;

public class Queue {
    int size = 5;
    int[] items = new int[size];
    int front, rear;

    Queue(){
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        return front == 0 && rear == size - 1;
    }

    boolean isEmpty(){
        return front == -1;
    }

    void enQueue(int element){
//        checks whether the queue is full
        if(isFull()){
            System.out.println("the queue is full atm");
        }
//        if it is empty an element is added
        else {
            if(front == -1) {
                front = 0;
            }
            rear++;
//            add elements to the rear pointer
            items[rear] = element;
            System.out.println("inserted" + element);
        }
    }

    int dequeue(){
        int element;
        if(isEmpty()){
            System.out.println("The queue is empty.");
            return (-1);
        }
        else {
//            access the element to be printed out later
            element = items[front];
            if(front>=rear){
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println("deleted" + element);
            return (element);
        }

    }

    void display(){
        int i;
        if(isEmpty()){
            System.out.println("the queue is empty");
        }
        else{
            System.out.println("the front index is: " + front);
            System.out.println("the items are: " );
            for (i=front; i<=rear; i++){
                System.out.println(items[i] + "  ");
            }
            System.out.println("the rear index is: " + rear);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(6);
        q.enQueue(5);
//        q.dequeue();
        q.display();

    }

}
