package org.BufferZero;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {
LinkedList<String> ls=new LinkedList<String>();
ls.add("Mango");
ls.add("Apple");
ls.add("orange");
ListIterator i=ls.listIterator(ls.size());

System.out.println(ls.size());

Collections.reverse(ls);
System.out.println(ls);


//while(i.hasPrevious()) {
//	System.out.println(i.previous());
//}
//	for(int j=ls.size()-1;j>0;j--) {
//		System.out.println(ls.get(j));
//	}

}
}


