package com.company.laba8.progect6;

public class Node {
    public int value;
    public Node next;
    public int amount;
    Node head;
    Node tail;
    Node(){

    }
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void createHead(int amount) {
        this.amount = amount;
        Node head = null;
        value = value + amount - 1;
        System.out.println("method - createHead: ");
        for (int i = amount; i > 0; i--) {
            head = new Node(value, head);
            System.out.print(" " + head.value);
            value--;
        }
        System.out.println();
        value++;
    }

    public void createTail(int amount) {
        this.amount = amount;
        Node tail = new Node(value + 1, null);
        this.tail = tail;
        head = new Node(0 , tail);
        System.out.println("method - createTail: ");
        System.out.print(" " + head.value);
        System.out.print(" " + tail.value);
        value ++;
        for (int i = 1; i < amount - 1; i++) {
            value++;
            tail.next = new Node(value, null);
            tail = tail.next;
            System.out.print(" " + tail.value);
        }
        System.out.println();
    }

    public void ToString() {
        Node ref = head;
        System.out.println("method - toString: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }

    public void AddFirst(int newValue) {
        Node firstHead = new Node(newValue, null);
        firstHead.next = head;
        head = firstHead;
        Node ref = head;
        System.out.println("method - AddFirst: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }

    public void AddLast(int newValue) {
        Node newtail = new Node(newValue, null);
        Node ref = tail = head;
        System.out.println("method - AddLast: ");
        System.out.print(" " + ref.value);
        while (ref.next != null) {
            ref = ref.next;
            System.out.print(" " + ref.value);
        }
        ref.next = newtail;
        System.out.print(" " + newtail.value);
        System.out.println();
    }

    public void Insert(int newValue, int number) {
        Node newNode = new Node(newValue, null);
        Node ref = tail = head;
        int k = number - 1;
        System.out.println("method - Insert: ");
        System.out.print(" " + ref.value);
        while (ref.next != null && (k < number)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;

        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();

    }

    public void RemoveFirst() {
        head = head.next;

        Node ref = tail = head;
        System.out.println("method - RemoveFirst: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }

    public void RemoveLast() {
        Node deleteTail = tail = head;
        while (deleteTail.next.next != null) {
            deleteTail = deleteTail.next;
        }
        deleteTail.next = null;

        System.out.println("method - RemoveLast: ");
        Node ref = tail = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }

    public void Remove(int number) {
        number--;
        Node delete = tail = head;
        int k = 1;
        while (delete.next != null && (k < number)) {
            delete = delete.next;
            k++;
        }
        delete.next = delete.next.next;
        System.out.println("method - Remove: ");
        Node ref = tail = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }


    int k = 0;

    public Node createHeadRec(int step, int amount) {
        this.amount = amount;
        value = value + step;
        if (amount > 0) {
            head = new Node(value, head);
            System.out.println(" " + head.value);
            head.createHeadRec(step, amount - 1);

        }
        return head;

    }

    Node tailRec;

    public Node createTailRec(int step, int amount) {
        this.amount = amount;
        head = new Node(value, tailRec);
        value = value + step;
        if (amount > 0) {
            head.next = new Node(value, head);
            System.out.println(" " + head.value);
            head.createHeadRec(step, amount - 1);

        }
        return head;
    }

    public Node toStringRec(int amount) {
        Node ref = head;
        this.amount = amount;
        if (amount > 0) {
            head.next = new Node(value, head);
            System.out.println(" " + head.value);
            head.toStringRec(amount - 1);
        }
        return head;
    }

}