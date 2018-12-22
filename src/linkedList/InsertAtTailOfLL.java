package linkedList;

import java.util.Scanner;

public class InsertAtTailOfLL {

	static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        } 
    }
	
	static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
	
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
	       if (head == null){
	        head = new SinglyLinkedListNode(data);
	    }
	    else {
	        SinglyLinkedListNode node = head;
	        while (node.next != null){
	            node = node.next;
	        }
	        node.next = new SinglyLinkedListNode(data);
	    }
	    return head;
	    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = scanner.nextInt();
        for(int i=0 ; i<llistCount; i++) {
        	int llistItem = scanner.nextInt();
        	SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
        	llist.head = llist_head;
        }
        scanner.close();
	}

}
