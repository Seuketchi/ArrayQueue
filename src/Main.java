// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(2);
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.dequeue());
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(9);
        System.out.println(arrayQueue.peek());
        arrayQueue.enqueue(4);
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.dequeue());
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(8);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue);
    }
}