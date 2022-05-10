package MyLinkedListRealisation;

public class MyLinkedList<T> implements List<T> {
    static class Node {
        Node next;
        Object value;
        public Node (Object value) {
            this.value = value;
            this.next = null;
        }
    }
    int size = 0;
    Node first;
    Node last;

    @Override
    public void add(T element) {
        if(first == null) {
            first = new Node(element);
            last = first;
        } else {
            last.next = new Node(element);
            last = last.next;
        }
        size++;
    }


    @Override
    public void remove(int index) {
        if (size == 0 || index > size - 1) {
            return;
        }

        Node checkedElement = first;
        Node previous = null;
        Node tempNode = null;
        if (index == 0) {
            first.next = null;
            size--;
        }

        else {
            int counter = 0;
            while(counter != index - 1) {
                checkedElement = checkedElement.next;
                counter++;
            }
            previous = checkedElement;
            tempNode = checkedElement.next.next;
            previous.next = tempNode;
            size--;
        }

    }

    @Override
    public T get(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current.value;
    }
}

