package org.srinivas.javaconceptsimplementation;

public interface DefaultMethodInterface {

	default int add(int a, int b){
		return 0;
	}
	default int sub(int a, int b){
		return a-b;
	}
}
