
public class CustomLinkedList<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to add a new element to the end of the LinkedList
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    // Method to print the elements of the LinkedList
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Getter method to retrieve the size of the LinkedList
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("LinkedList elements:");
        linkedList.printList();

        System.out.println("Size of the LinkedList: " + linkedList.getSize());
    }
}
