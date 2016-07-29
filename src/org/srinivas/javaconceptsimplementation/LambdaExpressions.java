package org.srinivas.javaconceptsimplementation;
import java.util.function.IntFunction;

public class LambdaExpressions {
	public static void main(String[] args) {
		IntFunction<Integer> incrementBy2=x->x+2;
		System.out.println(incrementBy2.apply(12));
		
		IntFunction<Integer> mulBy3=x->x*3;
		System.out.println(mulBy3.apply(4));
		
		IntFunction<String> threeOrFour=x->{ 
				if(x==3)return "three";
				else return "four";};
				
		System.out.println(threeOrFour.apply(4));
		
	}

}
