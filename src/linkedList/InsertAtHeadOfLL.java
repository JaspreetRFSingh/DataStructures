package linkedList;

import java.util.Scanner;

public class InsertAtHeadOfLL {

	static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

      
    }
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = head;
        return node;

    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = scanner.nextInt();
        for(int i=0 ; i<llistCount; i++) {
        	int llistItem = scanner.nextInt();
        	SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);
        	llist.head = llist_head;
        }
        scanner.close();
	}
}
