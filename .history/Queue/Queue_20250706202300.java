package Queue;

public class Queue {
    private List queueList;

    // no-argument constructor
    public Queue() {
        queueList = new List("queue");
    } // end Queue no-argument constructor

    // add object to queue
    public void enqueue(Object object) {
        queueList.insertAtBack(object);
    } // end method enqueue

    // remove object from queue
    public Object dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    } // end method dequeue

    // determine if queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    } // end method isEmpty

    // output queue contents
    public void print() {
        queueList.print();
    } // end method print
}
