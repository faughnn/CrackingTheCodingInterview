package LinkedLists;

import java.io.IOException;
import java.util.Hashtable;
import java.util.LinkedList;

public class RemoveDuplicates {
	
	public static LinkedList removeDuplicates(LinkedList n){
		
		Hashtable table = new Hashtable();
		LinkedList finalList = new LinkedList();
		
		for(int i = 0; i < n.size(); i++){
			if(!finalList.contains(n.get(i))){
				finalList.add(n.get(i));
			} 
		}
		return finalList;
	}
	
	public static void main(String[] args) throws IOException {
		
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(3);
		ll.add(2);
		ll.add(4);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(1);
		ll.add(2);
		
		System.out.println(ll);
		
		ll2 = removeDuplicates(ll);
		
		System.out.print(ll2);
	}

}
