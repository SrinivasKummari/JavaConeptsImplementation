package org.srinivas.javaconceptsimplementation;

public class DefaultMethodImplClass implements DefaultMethodInterface,DefaultMethodInterface1{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return DefaultMethodInterface.super.add(a, b);
	}
}
