package Linear;
class CirNode{
	int data;
	CirNode next;

public CirNode(int data) {
	this.data=data;
	next=null;
}}
class Methodd{
	static CirNode head,tail;
	static int count=0;
	public static void insertATBeg(int data) {
       CirNode nodee = new CirNode(data);
       if (head == null ) {
    	   head = tail = nodee;
           nodee.next = head; 

       } else {
           nodee.next = head;
           head = nodee;
           tail.next = head; 
       }

       count++;
}
	public static void  insertATend(int data) {
	      CirNode nodee = new CirNode(data);
	      if (head == null ) {
	    	  insertATBeg( data);
	       } else {
	           tail.next=nodee;
	           nodee.next=head;
	           
	       }
	      count++;
	}
	public static void insertATpos(int data,int pos) {
	      CirNode nodee = new CirNode(data);
	      CirNode temp=head;
	      if (head == null ) {
	      insertATBeg(data);}
	      else {
	    	  int i=1;
	    	  while (i<pos) {
	    		  temp=temp.next;
	    		  i++;
	    	  }
	    	  nodee.next=temp.next;
	    	  temp.next=nodee;
	      }
	}
	public static void deleteATbeg() {
//		if(head.next = null) {
//			head=tail=null;
//		}
		tail.next=head.next;
		head=head.next;
	}
	public static void deleteATend() {
		CirNode temp=head;
		do {
			temp=temp.next;
		}
		while(temp.next.next!=head);
		
		temp.next=head;
		
	}
	public static void deleteATpos(int pos) {
		CirNode temp=head;
		if(pos==0) {
            deleteATbeg();}
        else {
        	int i=1;
        	while(i<pos) {
        		temp=temp.next;
        		i++;
        	}
        	temp.next=temp.next.next;
//        	temp.next=temp;
    }
	}
	 public static void display() {
	        CirNode temp = head;
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

public class circularsingly extends Methodd{

	public static void main(String[] args) {
		insertATBeg(6);
		insertATBeg(6);
		insertATBeg(6);
		insertATBeg(6);
		insertATend(8);
		insertATpos(9,2);
		deleteATbeg();
		deleteATend();
		deleteATpos(1);
		display();

	}

}

