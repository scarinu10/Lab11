package edu.cscc;

public class Main {

    public static void main(String[] args) {
        list1();
        list2();
    }

    // Use linked list with Strings
    public static void list1(){
        LinkedList<String> llist = new LinkedList<>();
        llist.addFirst("one");
        llist.addLast("two");
        llist.addLast("three");
        llist.addFirst("zero");
        llist.addLast("xxxx");
        llist.addFirst("yyyyy");
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
        System.out.println(llist);
    }

    public static void list2(){
        LinkedList<Integer> llist = new LinkedList <>();
        llist.addFirst(1);
        llist.addLast(2);
        llist.addLast(3);
        llist.addFirst(0);
        llist.addLast(142);
        llist.addFirst(-97);
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
        System.out.println(llist);
    }
}
