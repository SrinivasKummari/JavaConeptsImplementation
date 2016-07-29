package org.srinivas.javaconceptsimplementation;
import java.util.ArrayList;

public class ArrayListImplementation {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		System.out.println(arrayList.add("first"));
		arrayList.add("second");
		arrayList.add("third");
		for(String s:arrayList){
			System.out.println(s+" element");
		}
		System.out.println();
		//add method will return void
		arrayList.add(0, "fourth");
		for(String s:arrayList){
			System.out.println(s+" element");
		}
		//remove method return true if element exist.
		System.out.println(arrayList.remove("first"));
		System.out.println();
		for(String s:arrayList){
			System.out.println(s+" element");
		}
		//returns the replaced element
		System.out.println(arrayList.set(1, "five"));
		for(String s:arrayList){
			System.out.println(s+" element");
		}
	}

}
