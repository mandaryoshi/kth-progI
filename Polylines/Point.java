
public class Point {
	private int X=0;
	private int Y=0;
	String Name = "";
	
	public Point() { 
		X=0;
		Y=0;
	}
	
	public Point(String name, int x, int y) {
		X=x; 
		Y=y;
		Name = name;
	}
	
	public Point(Point p) { 
		//receiving p1 or p2 from pointtest
		X= p.getX();
		Y= p.getY();
		Name = p.getName();	
	}
	
	//all set
	
	public String getName() {
		return Name;
	}
	
	public int getX() {
		return X;
	}
	
	public int getY() {
		return Y;
	}
	
	public double distance (Point p) {
		return Math.sqrt(Math.pow(X - p.X, 2) + Math.pow(Y - p.Y, 2)); 
		//X,Y refers to the first X position
		//p.X and p.Y is the new point x
	}
	
	public boolean equals (Point p) {
		return (p.getX()== X && p.getY() ==Y);
	}

	public void setX (int i) {
		X= i;
	}
	
	public void setY (int j) {
		Y=j;
	}
	
	public String toString() {
		String s = Name+"("+X+", "+Y+")";
		return s;
	}
}
