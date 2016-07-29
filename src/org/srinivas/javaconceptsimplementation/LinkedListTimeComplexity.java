package org.srinivas.javaconceptsimplementation;
import java.util.LinkedList;

public class LinkedListTimeComplexity {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("srini");
		list.add("fds");
		//removes the head element and sends it back
		list.remove();
		list.contains("srini");
		list.get(0);
	}

}
