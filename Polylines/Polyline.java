/** 
 * class Polyline provides a method how to get vertices, color, and width of a polyline.
 * In Polyline, theres an array of vertices, color, and width.
 * In vertices, you store the name(character), x value, and y value
 * This class is about copying resource
 *  When the main method where the other method is getting the resources from, is changing, the copied method wont get affected
 */

public class Polyline {
	private Point[] arrays;
	private String colour = " black ";
	private int width = 1;

	public Polyline() {
		this.arrays = new Point[0];
	}

	public Polyline(Point[] vertices)  {
		this.arrays = new Point[vertices.length];
		for (int i = 0; i < vertices.length; i++)
			this.arrays[i] = new Point(vertices[i]);
	}

	public String toString()  {
		StringBuilder allvertices = new StringBuilder();
		for(int i = 0; i < arrays.length; i++)
			allvertices.append(" " + arrays[i]);
		return "{[" + allvertices + " ], " + colour + ", " + width + "}";
	}

	public Point[] getVertices() {
		Point [] copyVertices = new Point [arrays.length];
		for (int i = 0; i < arrays.length; i++)
			copyVertices [i] = new Point ( arrays [i]);  
		
		//by adding new Point, copying the resources, 
		//not having the copyVertices at i pointing
		//the value at i in vertices 
		
		return copyVertices;
	}

	public String getColour() {
		return this.colour;
	}

	public int getWidth() {
		return this.width;
	}

	public void setColour(String colour) {
		this.colour= colour;
	} 
	public void setWidth(int width){
		 this.width=width ;
	}

	public double length() {
		double length = 0;
		for (int i=0 ; i< arrays.length-1; i++)
		{
			double distance =  arrays[i].distance(arrays [i+1]);
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

	public void addBefore(Point vertex, String vertexName) {	
		Point[] h = new Point[this.arrays.length + 1];
		int counter = 0;
		for (int i = 0; i < this.arrays.length; i++) {
			String name = arrays[i].getName();
			//give name 
			if (name == vertexName) {
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
	
	public void remove(String vertexName) {}


	public class PolylineIterator {
		private int current = -1; //default
	
		public PolylineIterator () {
			if ( Polyline.this.arrays.length > 0)
				current = 0;
		}
		
		public boolean hasVertex () {
			return current != -1;
		}
		
		public Point vertex ()
			throws java.util.NoSuchElementException
		{
			if (! this.hasVertex ())
				throw new java.util.NoSuchElementException ("end of iteration ");
			Point vertex = Polyline.this.arrays[ current ];
			return vertex ;
		}
		
		public void advance () {
			if (current >= 0 && current < Polyline.this.arrays.length - 1)
				current ++;
			else
				current = -1;
		}
	}
}
