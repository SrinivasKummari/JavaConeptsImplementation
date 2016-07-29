package org.srinivas.javaconceptsimplementation;
import java.util.ArrayList;

public class PointsList {

	private ArrayList<Point> pointsList;
	public PointsList() {
		pointsList=new ArrayList<>();
	}
	public void addPoint(Point point){
		if(point.getX()<0 || point.getY()<0){
			throw new IllegalArgumentException("Please provide +ve values");
		}else{
			pointsList.add(point);
		}
	}
	public static  void main(String[] args) {
		System.out.println("I am the first stmt in main");
		ArrayList<Point> points=new ArrayList<>();
		points.add(new Point(1, 1));
		points.add(new Point(2, 3));
		
		Point p=new Point(1, 1);
		System.out.println(p.getX());
		if(points.contains(p)){
			System.out.println("Yes it does");
		}else{
			System.out.println("Nope it doesn't");
		}
		PointsList pl=new PointsList();
		try{
		pl.addPoint(new Point(-1,-3));
		}catch(IllegalArgumentException e){
			System.out.println("Please provide positive values");
		}finally {
			System.out.println("I am finally block");
		}
	}

}
