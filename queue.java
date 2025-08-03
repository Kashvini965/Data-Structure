package Linear;
class NNode{
	int data;
	NNode next;
	public NNode(int data) {
		this.data=data;
		next=null;
	}
}
class Methodds{
	static NNode front;
	static NNode rear;
	static int count=-1;
	public static void enqueue(int data) {
		NNode node=new NNode(data);
		if(front==null && rear==null) {
			front=node;
			rear=node;
			return;
		}
		else {
		rear.next=node;
		rear=node;
		}	
		count++;
	}
	public static void dequeue() {
		if(count==-1) {
			System.out.println("queue is empty");
			return;
		}
		if(count==0) { 
			System.out.println("popped data:"+front.data);
			count--;
			return;
}
			NNode temp=front;
			while(temp.next.next!=null) {
				temp=temp.next;

			}

			System.out.println("popped data ="+ front.data);
			front=temp;
			temp.next=null;
			count--;			
	}
	public static void peak() {
		if(count==-1) {
			System.out.println("queue is empty");
			return;
		}
		else {
			System.out.println(front.data);
		}
	}}
public class queue extends Methodds{

	public static void main(String[] args) {
		enqueue(9);
		enqueue(2);
		enqueue(7);
		enqueue(7);
		enqueue(4);
		dequeue();
		peak();
	}

}
