package org.srinivas.javaconceptsimplementation;
import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;

public class CheckInstance {
	
	
	static Bar getBar(List<Object> stuff) throws NoSuchObjectException{
		Bar bar=null;
		for(int i=0;i<stuff.size();i++){
				if(stuff.get(i) instanceof Bar){
					bar=(Bar)stuff.get(i);
				}
		}
		if(bar==null){
			throw new NoSuchObjectException(null);
		}else{
			return bar;
			}
			
	}

	public static void main(String[] args) throws NoSuchObjectException {
		List<Object> stuff=new ArrayList<Object>();
		stuff.add("add");
		stuff.add(new Bar("bar1"));
		stuff.add(new Bar("bar2"));
		System.out.println(getBar(stuff).toString());
	}

}
