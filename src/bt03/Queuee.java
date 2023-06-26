package bt03;

public class Queuee {
    private Node front, rear;

    public Queuee() {
        front = rear = null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    public int deQueue() {
        if (front == null)
            System.err.println("Queue is empty");

        int data = front.data;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }

        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }


}
