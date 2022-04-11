package com.company.laba8.progect5;


class Node {
    public int value;
    public Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }}
public class DSD_create {
    public static void main(String[] args) {
        Node head1 = new Node(0, null);
        DSD_create.f(head1);
        DSD_create.vevod(head1);
        System.out.println();
        Node head2 = DSD_create.Head();
        DSD_create.vevod(head2);
    }

    public static void f(Node head1) {
        Node tail = head1;
        for (int i = 0; i < 9; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }
    }

    public static void vevod(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public static Node Head() {
        Node head2 = null;
        for (int i = 9; i >= 0; i--) {
            head2 = new Node(i, head2);
        }
        return head2;
    }
}
