package org.srinivas.javaconceptsimplementation;
import java.util.Arrays;
import java.util.HashSet;

public class InheritanceUsingInterface implements InheritanceInIterface{

	//int pi=4;
	
	InheritanceUsingInterface(){
		
		//this.pi=pi;
	}
	public static void main(String[] args) {
		InheritanceUsingInterface iui=new InheritanceUsingInterface();
		System.out.println(iui.name);
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		int[] arr={1,4,3,2};
		System.out.println(Arrays.toString(arr));
		HashSet<Object> hs=new HashSet<>();
		
	}
}
