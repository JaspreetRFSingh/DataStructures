package linkedList;

public class InsertAtSpecificPos {

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
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = head;
    if (position == 0){
        node = new SinglyLinkedListNode(data);
        node.data = data;
        node.next = head;
        return node;
    }
    else {
        while(--position > 0){
            node = node.next;
        }
        SinglyLinkedListNode i = node.next;
        node.next = new SinglyLinkedListNode(data);
        node.next.data = data;
        node.next.next = i;
        return head;
    }
    }
	
	public static void main(String[] args) {
		
		//insertNodeAtPosition(head, data, position);
		
	}

}
