
public class CList<T> {
	private Node<T> head;
	private int size;
	
	private static class Node<T>{
		T data;
		Node<T> next;
		
		Node(T data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public CList(){
		this.head=null;
		this.size=0;
	}
	
	public void add(T data) {
		Node<T> currentNode=new Node<>(data);
		if(head==null) {
			head=currentNode;
		}else {
			Node<T> current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=currentNode;
		}
		size++;
	}
	
	void printList() {
		Node<T> current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		} System.out.println();
	}
	

	public static void main(String[] args) {
		CList<Integer> c=new CList<>();
		c.add(10);
		c.add(25);
		c.add(35);
		c.printList();
		System.out.println(c.size);
	}

}
