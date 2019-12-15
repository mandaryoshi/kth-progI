
public class Polyline1 {
	/**
	 * class Polyline provides a method how to get vertices, color, and width of
	 * a polyline. In Polyline, theres an array of vertices, color, and width.
	 * In vertices, you store the name(character), x value, and y value This
	 * class is about copying resource When the main method where the other
	 * method is getting the resources from, is changing, the copied method wont
	 * get affected
	 */
	private Point[] arrays;
	private String colour = " black ";
	private int width = 1;

	public Polyline1() 
		{
			this.arrays = new Point[0];
		}

	public Polyline1(Point[] vertices) 
		{
			this.arrays = new Point[vertices.length];
			for (int i = 0; i < vertices.length; i++)
				this.arrays[i] = new Point(vertices[i]);
		}

	public String toString() {
		StringBuilder allvertices = new StringBuilder();
		for (int i = 0; i < arrays.length; i++)
			allvertices.append(" " + arrays[i]);
		return "{[" + allvertices + " ], " + colour + ", " + width + "}";
	}

	public Point[] getVertices() {
		return this.arrays;
	}

	public String getColour() {
		return colour;
	}

	public int getWidth() {
		return width;
	}

	public void setColour(String colour) {
	}

	public void setWidth(int width) {
	}

	public double length() {
		double length = 0;
		for (int i = 0; i < arrays.length - 1; i++) {
			double distance = arrays[i].distance(arrays[i + 1]);
			length = length + distance;
		}
		return length;
	}

	public void addLast(Point vertex) {
		Point[] h = new Point[this.arrays.length + 1];
		int i = 0;
		for (i = 0; i < this.arrays.length; i++)
			h[i] = this.arrays[i];
		h[i] = new Point(vertex);
		this.arrays = h;
	}

	public void addBefore(Point vertex, String vertexName) 
	{	
		Point[] h = new Point[this.arrays.length + 1];
		int counter = 0;
		for (int i = 0; i < this.arrays.length; i++) {
			String name = arrays[i].getName();
			//give name 
			if (name == vertexName)
			{				
				h[counter]=vertex;
				counter++;
				h[counter]=arrays[i];
				counter++;
			}
			else
			{
				h[counter] = arrays[i];
				counter++;
			}
		}
		
		this.arrays = h;
		
	}

	public void remove(String vertexName) 
	{
		Point[] h = new Point[this.arrays.length + 1];
		
		int counter = 0;
		
		for (int i = 0; i < this.arrays.length; i++)
		{
			String name = arrays[i].getName();
			//give name 
			if (name == vertexName)
			{
				arrays[i]=null;
				counter++;
				h[counter]=arrays[i];
				counter++;
			}
			else
			{
				h[counter] = arrays[i];
				counter++;
			}
	}
}
}
