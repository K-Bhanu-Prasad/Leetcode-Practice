package main.java;

import java.util.HashSet;

/**
 * Java program to detect loop in a linked list
 */
public class DetectCycleInLinkedList {

    Node head; // head of list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    boolean detectLoop() {
        Node slowPtr = head;
        Node fastPtr = head;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) return true;
        }
        return false;
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        DetectCycleInLinkedList llist = new DetectCycleInLinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        System.out.println(llist.detectLoop());
    }
}
