import java.util.collections.List;

class Canvas{
	List<Point> pointList;

	public void addPoint(double x, double y, String color){
		String newId = String.toString(pointList[pointList.length()-1].id + 1); //incrementing the last id for the new point
		Point pt = new Point(newId, x, y, color);
		this.pointList.add(pt);
	}

	public void deletePoint(String id){
		int poistion = this.pointList.indexOf(id);
		this.pointList.remove(poistion);
	}
}

public class Point {
	String id
	double x,y;
	String color;
	//TODO add new variable

	//TODO constructor

	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		//TODO
		this.x = this.x+1 ? xDirection.equals("D") : this.x;
		this.x = this.x-1 ? xDirection.equals("U") : this.x;

		this.y = this.x+1 ? xDirection.equals("R") : this.y;
		this.y = this.y-1 ? xDirection.equals("L") : this.y;
	}

	public void draw () {
		//TODO
		System.out.println("{"+this.x+", "+this.y"}");
	}

	public Point(String id, double x, double y, String color){
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public getColor(){return color;}

	public getX(){return x;}

	public getY(){return y;}

	public getId(){return id;}

	public setColor(String color){this.color = color;}

	public setX(double x){this.x = x;}

	public setY(double y){this.y=y;}

	public setId(String id){this.id = id;}

}