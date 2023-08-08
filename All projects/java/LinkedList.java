public class LinkedList{
	private ListNode head;
	
	private static class ListNode{
		private int data; //generic type
		private ListNode next;

		public ListNode(int data){
			this.data=data;
			this.next=null;
}
}
	public void display(){
		ListNode current=head;
		while(current !=null){
			System.out.print(current.data + "-->");
			current=current.next;

		}
		System.out.println("null");
}
	public int length(){
		if(head==null){
		return 0;
	}
		int count=0;
		ListNode current=head;
		while(current !=null){
		count++;
		current=current.next;
        }
		return count;
}


	public void insertFirst(int value){
		ListNode newNode=new ListNode(value);
		newNode.next= head;
		head= newNode;
}

	public static void main(String[] args){
		
		LinkedList sll= new LinkedList();

	/*	LinkedList sll=new LinkedList();
		sll.head=new ListNode(10);
		ListNode second= new ListNode(1);
		ListNode third= new ListNode(5);
		ListNode fourth= new ListNode(8);

	//Now we will conect together too form a chain

		sll.head.next=second; //10-->1
		second.next=third;  //10--> 1 --> 5
		third.next=fourth;  //10--> 1 --> 5 -->8 -->null   */
		

		sll.insertFirst(11);
		sll.insertFirst(7);
		sll.insertFirst(6);
		sll.display();
		//System.out.println("Length is-" +sll.length());
}		
}
