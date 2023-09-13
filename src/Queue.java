public interface Queue {
    void enqueue(int e);
    int dequeue();
    int peek();
    int size();
    boolean isEmpty();
    String toString();
}
