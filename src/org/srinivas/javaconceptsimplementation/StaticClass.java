package org.srinivas.javaconceptsimplementation;

public class StaticClass {

	static class NestedClass{
		private int i;
		public NestedClass(int i) {
			this.i=i;
		}
	}
	public static void main(String[] args) {
		NestedClass nc=new NestedClass(0);
	}
}
