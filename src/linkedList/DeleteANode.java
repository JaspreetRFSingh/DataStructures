package linkedList;

import java.util.Scanner;
public class DeleteANode {

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

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	            this.tail = node;
	        }
	    }
	    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
	        SinglyLinkedListNode node = head;
	    if (position == 0){
	        return node.next;
	    }
	    while (--position > 0){
	        node = node.next;
	    }
	    node.next = node.next.next;
	    return head;
	    }
	
	    static void printLinkedList(SinglyLinkedListNode head) {
	        while (head != null) {
	        System.out.println(head.data);
	        head = head.next;}
	    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = scanner.nextInt();
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            llist.insertNode(llistItem);
        }
        int position = scanner.nextInt();
        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);
        printLinkedList(llist1);
		scanner.close();
	}

}
