package DSA;

public class LinkedList {
    private Node head;
    private int size;

    private class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Integer element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // if the next node is not null, then move to the next node
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean contains(Integer element) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        linkedList.printList();

        System.out.println("Size: " + linkedList.size());

        System.out.println("Contains 20: " + linkedList.contains(20));
        System.out.println("Contains 50: " + linkedList.contains(50));
    }
}
