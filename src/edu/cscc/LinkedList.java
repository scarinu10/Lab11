package edu.cscc;

public class LinkedList <T>{
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addFirst(T object) {
        Node ptr = head;
        head = new Node(object,ptr);
    }

    public void addLast(T object) {
        Node last = new Node(object,null);
        if (head == null) {
            head = last;
        } else {
            Node ptr = head;
            while(ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(last);
        }
    }

    public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }

    public boolean deleateLast() {
        if (head == null) {
            return false;
        }
        else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            Node ptr = head;
            while (ptr.getNext().getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(null);
            return true;
        }
    }

    public Node getHead() {
        return head;
    }

    public String toString() {
        String str;
        if (head == null) {
            str = "<empty>";
        } else {
            Node ptr = head;
            str = "("+ptr.getContent().toString()+")";
            while(ptr.getNext() != null) {
                str = str + "->";
                ptr = ptr.getNext();
                str = str + "(" + ptr.getContent().toString() + ")";
            }
        }
        return str;
    }
}
