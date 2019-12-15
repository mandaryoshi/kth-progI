import java.util.*;

class SelectPolyline {
	public static final Random rand = new Random();
	public static final int NOF_POLYLINES = 2;

	public static void main(String[] args) 
	{
		// Create a random number of polylines
		Polyline[] polylines = new Polyline[NOF_POLYLINES];
		for (int i = 0; i < NOF_POLYLINES; i++)
			polylines[i] = randomPolyline();

		// Show the polylines
		
		for (Polyline poly : polylines) {
			System.out.println(poly);
		}
		
		// Determine the shortest yellow polyline
		double minLength = Double.POSITIVE_INFINITY;
		Polyline minYellow = null;
		for(int i=0; i<NOF_POLYLINES;i++) {
			if(polylines[i].getColour().equals("yellow")&&polylines[i].length()<=minLength) {
				minYellow =polylines[i];
				minLength =minYellow.length();
			}
		}
		// Show the selected polyline
		System.out.println("shortest yellow polyline is "+ "\n"+ minYellow +"  "+minLength+"cm");
	}


	// The randomPoint method returns a new Point with a name
	// randomly chosen from the single letters A--Z. Coordinates
	// are random .
	public static Point randomPoint() {
		String n = "" + (char) (65 + rand.nextInt(26));
		int x = rand.nextInt(11);
		int y = rand.nextInt(11);
		return new Point(n, x, y);
	}


	// The method randomPolyline returns a random polyline ,
	// with a colour either blue , red , or yellow . The names
	// of the vertices are single letters from the set A--Z.
	// Two vertices can not have the same name .
	public static Polyline randomPolyline()
	{
		// Create an empty polyline and add vertices
		
		Polyline polyline = new Polyline();
		int nofVertices = 2 + rand.nextInt(7);
		int nofSelectedVertices = 0;
		boolean[] selectedNames = new boolean[26];
		int a ;
		
		// Two vertices can not have the same name
		Point chosenPoint = null;
		char chosenChar = 0;
		while (nofSelectedVertices < nofVertices) 
		{
			chosenPoint = randomPoint();
			chosenChar = chosenPoint.Name.charAt(0);
			a = (int) chosenChar -65;
			if(!selectedNames[a]) {
				//when the selectedname at a was not used, 
				//polyline gets that chosenPoint at its last.
				polyline.addLast(chosenPoint);
				//then after it gets used, 
				//it has to have the value of true
				selectedNames[a]= true;
				//since the new vertex is just added
				nofSelectedVertices++;
			}
		}
		polyline.setColour(colour1());
		return polyline;
	}

	// Assign a colour

	public static String colour1() {
		String colour1 = new String();
		int colours = rand.nextInt(3);
		if(colours==0) {
			colour1 ="blue";
		}
		else if(colours==1)	{
			colour1 ="red";
		}		
		else {
			colour1 ="yellow";
		}
		
		return colour1;
	}

}
