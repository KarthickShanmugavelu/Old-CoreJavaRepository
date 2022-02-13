package collections;

public class LinkedList1 {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static LinkedList1 insert(int data, LinkedList1 listParam) {

		// assign incoming data to a Node object.
		Node newNode = new Node(data);
		newNode.next = null;

		// checking whether the list is empty
		if (listParam.head == null) {

			listParam.head = newNode;
		}
		
		//if the list is not empty
		else {
			Node last = listParam.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		
		return listParam;

	}
	
	public static void printList(LinkedList1 listParam) {
		
		Node node=listParam.head;
		while(node.next!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.print(node.data);
	}
	
	public static void main(String[] args) {
		
		LinkedList1 newList = new LinkedList1();
		
		newList = insert(1,newList);
		newList = insert(2,newList);
		newList = insert(3,newList);
		newList = insert(4,newList);
		newList = insert(5,newList);
		newList = insert(6,newList);
		newList = insert(7,newList);
		newList = insert(8,newList);
		
		printList(newList);
		
	}
	
	
	
	
	
	
	
}
