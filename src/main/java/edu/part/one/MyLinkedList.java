package edu.part.one;

public class MyLinkedList
{
    private Node head;

    public Node getHead()
    {
        return this.head;
    }

    public void setHead(Node head)
    {
        this.head = head;
    }

    private int size = 0;

    public int getSize()
    {
        return this.size;
    }

    public void calculateSize() {
        this.size = 0;
        Node tmp = this.head;
        while(tmp != null) {
            size++;
            tmp = tmp.next;
        }
    }

    // addFirst: method adds first elements
    public void addFirst(String item)
    {
        this.addAtPosition(0, item);
    }

    // addLast: appends the node to the end of the list.
    public void addLast(String item)
    {
        this.addAtPosition(this.getSize(), item);
    }

    // addAtPosition: adds new item into the list at specific position
    public void addAtPosition(int position, String item)
    {
        calculateSize();
        // Add your code here
        Node pre = this.head;
        Node next = null;

        if(position > size || position<0) {
            calculateSize();
            return;
        }

        if(position == 0) {
            Node n = new Node(item, this.head);
            setHead(n);
            calculateSize();
            return;
        }

        if(position == 1) {
            pre = this.head;
        }

        for(int i = 1; i<position && position > 1; i++){
            pre = pre.next;
        }

        next = pre.next;
        Node n = new Node(item, next);
        pre.next = n;
        calculateSize();

    }

    // deleteAtPosition: deletes item from the list at specific position
    public Node deleteAtPosition(int position)
    {
        // Add your code here (and remove null)
        calculateSize();
        // Add your code here
        Node pre = this.head;
        Node next = null;

        if(position >= size || position<0) {
            return null;
        }

        if(position == 0) {
            setHead(pre.next);
            calculateSize();
            return pre;
        }

        if(position == 1) {
            pre = this.head;
        }

        for(int i = 1; i<position && position > 1; i++){
            pre = pre.next;
        }

        next = pre.next;
        pre.next = next.next;
        calculateSize();
        return next;
    }

    // findByPosition: finds the element at specific position in the MyLinkedList
    public Node findByPosition(int position) throws IndexOutOfBoundsException
    {
        if(position >= this.size || position < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node tmp = this.head;
        for(int i=0; i<position; i++) {
            tmp = tmp.next;
        }

        return tmp;
    }

    // Traverse over MyLinkedList
    public void traverse()
    {
        Node tmp = this.head;
        System.out.printf("%s content: [ ", this.getClass().getName());
        while (tmp != null) {
            System.out.printf("%s ", tmp.data);
            tmp = tmp.next;
        }
        System.out.printf("]\tSize: %d\n", this.size);
    }

    public static void main(String[] args)
    {
        // Creating MyLinkedList instance
        MyLinkedList list = new MyLinkedList();

        int position = 0;
        String[] array = new String[]{"David", "Marko", "Helen", "Emma", "Grace"};
        for(String item: array) {
            list.addAtPosition(position, item);
            position++;
            list.traverse();
        }

        list.addAtPosition(3, "Terry");
        list.addLast("Terry");
        list.traverse();

        list.deleteAtPosition(1);
        list.traverse();
    }
}

class Node
{
    // Data value stored in the node
    public String data;

    // The reference to the next node
    public Node next;

    // Constructor that creates a node with the given data item
    public Node(String data)
    {
        this.data = data;
    }

    // Constructor that creates a node with the given data item and reference pointed to null
    public Node(String data, Node next)
    {
        this(data);
        this.next = next;
    }
}