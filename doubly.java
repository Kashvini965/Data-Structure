
package Linear;

class DubNode {
    int data;
    DubNode next;
    DubNode prev;

    public DubNode(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class DubMethods {
    static DubNode head, tail;
    static int count = 0;

    public static void insertAtBegg(int data) {
        DubNode node = new DubNode(data);
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        count++;
    }
    public static void insertAtEndd(int data) {
        DubNode node = new DubNode(data);
        if(head == null && tail == null) {
            head = tail = node;}
        else {
        	tail.next=node;
        	node.prev=tail;
        	tail=node;
        }
    }
    public static void insertAtPoss(int data,int pos) {
        DubNode node = new DubNode(data);
        DubNode temp=head;
        if(pos==0) {
            insertAtBegg(data);}
        else {
        	int i=1;
        	while(i<pos) {
        		temp=temp.next;
        		i++;
        	}
        	
        	node.next=temp.next;
    		node.next.prev=node;
      	    temp.next=node;
    		node.prev=temp;
        }
    }
    public static void deleteAtBegg() {
    	head=head.next;
    	head.prev=null;
    }
    public static void deleteAtEndd() {
    	tail=tail.prev;
    	tail.next=null;
    }
    public static void deleteAtPoss(int pos) {
    	DubNode temp=head;
    	if(pos==0) {
            deleteAtBegg();}
        else {
        	int i=1;
        	while(i<pos) {
        		temp=temp.next;
        		i++;
        	}
        	temp.next=temp.next.next;
        	temp.next.prev=temp;
    }}
    public static void display() {
        DubNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Length: " + count);
    }
}

public class doubly extends DubMethods {
    public static void main(String[] args) {
        insertAtBegg(10);
        insertAtBegg(20);
        insertAtBegg(30);
        insertAtBegg(40);
        insertAtEndd(40);
        insertAtPoss(78,2);
        deleteAtBegg() ;
        deleteAtEndd() ;
        deleteAtPoss(2);
        display();
    }
}

