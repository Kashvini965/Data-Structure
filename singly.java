package Linear;

//node class
class Node {
	int data;
	Node next;
// reference to the node class

	public Node(int data) {
		this.data = data;
		next = null;
	}
}
//method class
class Methods {
	static Node head = null;
	static int count = 0;

	public static void insertAtBeg(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
		count++;

	}

	public static void insertAtEnd(int data) {
		Node newnode = new Node(data);
		Node temp = head;
		if(head==null) {
			insertAtBeg(data);}
		else {
		while (temp.next!= null) {
			temp = temp.next;
		}
		temp.next = newnode;
		count++;
		}
	}
	public static void insertAtPosition(int data,int pos) {
		Node newnode = new Node(data);
		Node temp = head;
		if(pos==0) {insertAtBeg(data);}
		else {
			int i=1;
		while (i < pos) {
			temp = temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next = newnode;
		}
	
	}
	public static void deleteAtBeg() {
		Node temp = head;
		head=head.next;
		temp.next=null;
		count--;
	}
	public static void deleteAtEnd() {
		Node temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		count--;
	}
	public static void deleteAtPos(int pos) {
		Node temp = head;
		if(pos==0) {
			deleteAtBeg();
		}
		else
		{   int i=1; 
			while(i<pos) {
				temp=temp.next;
				i++;
			}
			temp.next=temp.next.next;
			count--;
		}
	}
	public static void display() {
		Node temp = head;
		while (temp!= null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.print("length:" + count);
	}

}

public class singly extends Methods {
	public static void main(String[] args) {
		insertAtBeg(7);
		insertAtBeg(7);
		insertAtBeg(7);
		insertAtEnd(8);
		insertAtPosition(5,2);
		deleteAtBeg();
		deleteAtEnd();
		deleteAtPos(2);
		display();
	}

}

