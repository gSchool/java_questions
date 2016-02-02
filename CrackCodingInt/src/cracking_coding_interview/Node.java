package cracking_coding_interview;

public class Node {
	Node nextnode = null ; 
	String data; 
	
	public Node(String contents){
		data = contents;
	}
	
	public void appendToTail(String contents){
		Node end = new Node(contents);
		Node n = this;
		while (n.nextnode != null){
			n = n.nextnode; 
		}
		n.nextnode = end; 
	}
}
