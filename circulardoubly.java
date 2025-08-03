package Linear;
class CDNode{
	int data;
	CDNode next,prev;

public CDNode(int data) {
	this.data=data;
	next=null;
	prev=null;
}}
class Methood{
	static CDNode head,tail;
	static int count=0;
	public static void insertATBeg(int data) {
       CDNode nodee = new CDNode(data);
       if (head == null && tail==null ) {
    	   head = tail = nodee;
           head.next = nodee;
           head.prev = nodee;
           

       } else {
           nodee.next = head;
           nodee.prev = tail;
           head = nodee;
           tail.next = head; 
       }

       count++;
}	
	public static void insertATEnd(int data) {
		  CDNode nodee = new CDNode(data);
	      if (head == null ) {
	    	  insertATBeg( data);
	       } else {
	    	   nodee.prev=tail;
	           tail.next=nodee;
	           nodee.next=head;
	           
	       }
	      count++;
	}
	public static void insertATPos(int data,int pos) {
		  CDNode nodee = new CDNode(data);
	      CDNode temp=head;
		  if (head == null ) {
	    	  insertATBeg( data);
	       }
		  
		  else {
			  int i=1;
	    	  while (i<pos) {
	    		  temp=temp.next;
	    		  i++;
	    	  }
	    	  nodee.next=temp.next;
	    		nodee.next.prev=nodee;
	      	    temp.next=nodee;
	    		nodee.prev=temp;
		  }
		  count++;
	}
	public static void deleteATBeg() {
		tail.next=head.next;
		head=head.next;
    	head.prev=null;
    	count--;
	}
	public static void deleteATEnd() {
//		head.prev=tail.prev;
//		tail=tail.prev;
//    	tail.next=head;
		
//	tail.next=null;
//	tail=tail.prev;
//	tail.next.prev=null;
//	tail.next=head;
//	head.prev=tail;
	
		CDNode temp=head;
		do {
			temp=temp.next;
		}
		while(temp.next.next!=head);
		
		temp.next=head;
		head.prev=tail;	
		count--;
	}
	public static void deleteATPos(int pos) {
		CDNode temp=head;
		if(pos==0) {
            deleteATBeg();}
        else {
        	int i=1;
        	while(i<pos) {
        		temp=temp.next;
        		i++;
        	}
        	temp.next.prev=temp.next.prev;
        	temp.next=temp.next.next;
//        	temp.next=temp;
        	count--;
    }
	}
	public static void display() {
    CDNode temp = head;
    if(head==null) {
    	System.out.print("list is empty");
    }
   do {
        System.out.print(temp.data + " ");
        temp = temp.next;
    } while (temp!= head);
    System.out.println();
    System.out.println("Length: " + count);
}}
public class circulardoubly extends Methood {
public static void main(String[] args) {
	insertATBeg(6);
	insertATBeg(9);
	insertATBeg(8);
	insertATBeg(5);
	insertATBeg(6);
	insertATEnd(7);
	insertATPos(5,2);
	deleteATBeg();
	deleteATEnd();
	deleteATPos(2);
	display();
}
}

