package linkedList;

import java.util.Scanner;

public class PrintElementsOfLL {
	
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
	
	static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
        System.out.println(head.data);
        head = head.next;}
    }
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0 ; i<n; i++) {
			int li = scan.nextInt();
			sll.insertNode(li);
		}
		printLinkedList(sll.head);
		scan.close();
	}

}
