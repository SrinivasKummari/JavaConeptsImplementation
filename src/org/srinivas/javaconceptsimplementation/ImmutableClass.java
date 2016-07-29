package org.srinivas.javaconceptsimplementation;

public final class ImmutableClass {

	private final String name;
	private final int age;
	
	public ImmutableClass(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass ic=new ImmutableClass("Srini", 26);
		ImmutableClass ic1=new ImmutableClass("fda", 23);
		System.out.println(ic);
		System.out.println(ic1);
	}

}
