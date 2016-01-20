package LinkedLists;

import java.io.IOException;
import java.util.LinkedList;

public class RemoveKthToLastElement {
	
	public static int removeKthToLastElement(LinkedList n, int k){

		return (Integer) n.get(n.size() - k);
	}
	
	public static void main(String[] args) throws IOException {
		
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		ll.add(11);
		ll.add(12);
		
		int k = removeKthToLastElement(ll, 5);
		System.out.println(k);
		
	}

}
