package com.company.laba8.progect6;

public class DSD_create {
    public static void main(String[] args) {
        Node Node1 = new Node();
        Node1.createTail(5);
        Node1.ToString();
        Node1.AddFirst(6);
        Node1.AddLast(7);
        Node1.Insert(4,3);
        Node1.ToString();
        Node1.RemoveFirst();
        Node1.RemoveLast();
        Node1.ToString();
        Node1.Remove(2);
        Node1.ToString();
    }
    }

