package edu.cscc;

public class Node <T> {
    private T object;
    private Node next;

    public Node(T object, Node next) {
        this.object = object;
        this.next = next;
    }

    public Object getContent() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
