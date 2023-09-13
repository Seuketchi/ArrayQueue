public class ArrayQueue implements Queue{
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int headPointer;
    private int rearPointer;
    private int size;
    public ArrayQueue() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.headPointer = 0;
        this.rearPointer = -1;
        this.size = 0;
    }
    @Override
    public void enqueue(int e) {
        if(isFull()) {
            grow();
        }
        rearPointer = (rearPointer + 1) % elements.length;
        elements[rearPointer] = e;
        size++;
    }

    @Override
    public int dequeue() {
        if (size() == 0) {
            return -1;
        }
        int e = elements[headPointer];
        headPointer = (headPointer + 1) % elements.length;
        size--;
        return e;
    }

    @Override
    public int peek() {
        return elements[headPointer];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == elements.length;
    }
    public void grow() {
        int targetSize = size + 1;
        if (targetSize > elements.length) {
            int newSize = elements.length + (elements.length >> 1);
            if (newSize <= targetSize) newSize++;
            int[] newArray = new int[newSize];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
    }
    @Override
    public String toString() {
        if (isEmpty()) {
            return "()";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("(");
        int index = headPointer;

        for (int i = 0; i < size(); i++) {
            sb.append(elements[index]);
            if (i < size - 1) {
                sb.append(", ");
            }
            index = (index + 1) % elements.length;
        }

        sb.append(")");
        return sb.toString();
    }
}
