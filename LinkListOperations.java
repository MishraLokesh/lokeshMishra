class Node{
	int data;
	Node next;
}
class LinkList{
	Node head;
	public void insertAtEnd(int a){
		Node node = new Node();
		node.data = a;
		if (head == null)head = node;
		else {
			Node temp;
			temp = head;
			while(temp.next != null){
				temp = temp.next;
				}
			temp.next = node;
			}
		}
	public void insertAtBeginning(int a){
			Node node = new Node();
			node.data = a;
			if(head == null)head = node;
			else{
				node.next = head;
				head = node;
			}
		}
	public void insertInMiddle(int a,int n){
		int c = 0;
			Node node = new Node();
			node.data = a;
			if(head == null)head = node;
			else{
				Node tempo;
				Node tempo2;
				tempo = head;
				while(c!=(n-2)){
					tempo = tempo.next;
					c++;
					}
				tempo2 = tempo;
				tempo2 = tempo2.next;
				tempo.next = node ;

				node.next = tempo2;
		}
	}
	public void show(){
		Node temp;
		temp = head;
		while(temp.next != null){
			System.out.print(temp.data+"\t");
			temp = temp.next;
			}
			System.out.print(temp.data+"\t");
	}
}
class LinkListOperations{
	public static void main(String args[]){
		LinkList ob = new LinkList();
		ob.insertAtEnd(5);
		ob.insertAtBeginning(101);
		ob.insertAtEnd(1);
		ob.insertAtEnd(0);
		ob.insertAtEnd(9);
		ob.insertAtBeginning(99);
		ob.insertInMiddle(5000,5);
		ob.insertInMiddle(500,9);

		ob.show();
	}
}
