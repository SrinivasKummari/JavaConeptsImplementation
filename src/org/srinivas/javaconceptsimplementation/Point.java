package org.srinivas.javaconceptsimplementation;
import java.util.Objects;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Point {

	private static  int  x;
	private static  int  y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Point getPoint(){
		Point p=new Point(x, y);
		return p;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	static{
		System.out.println("hellooooo I am static block");
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return new HashCodeBuilder().append(x).append(y).toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else if(obj==this) return true;
		else if(obj.getClass() !=getClass()){
			return false;
		}else{
			Point point= (Point)obj;
			return new EqualsBuilder().append(x, point.x).append(y,point.y).isEquals();
		}
	}
}

