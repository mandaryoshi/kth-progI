import java.util.*;

public class PolylineTest {
	public static void main (String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		Point p0 =new Point("A",4,6);
		Point p1 =new Point("B",3,4);
		Point p2 =new Point("C",5,6);
		Point p3 =new Point("D",1,8);
		Point p4 =new Point("E",1,2);
		Point p5 =new Point("F",3,5);
		
		Point points [] ={p1,p2,p3,p4}; 
		Polyline pl1 = new Polyline (points);
		Polyline1 pl2 = new Polyline1(points);
		
		//color
		System.out.println("Current points: " +p1+p2+p3+p4);
		System.out.println("Current colour is " + pl1.getColour());
		System.out.println("New colour is ");
		pl1.setColour(in.next());
		System.out.println("Now, colour is " +pl1.getColour());
		
		//width
		System.out.println("");
		System.out.println("Current width is " +pl1.getWidth());
		System.out.println("New width is " +"x" +"(cm)" +",,enter x");
		pl1.setWidth(in.nextInt());
		System.out.println("Now, width is " +pl1.getWidth());
		
		//length
		System.out.println("");
		System.out.println("Polyline length is "+ pl1.length());
		
		//add/remove
		System.out.println("point F comes last");
		pl1.addLast(p5);
		System.out.println(pl1);		
		
		System.out.println("point A comes first");
		pl1.addBefore(p0,"B");
		System.out.println(pl1);

		System.out.println("\n");
		
		System.out.println("Polyline1");
		System.out.println("point A comes before E");
		pl2.addBefore(p0,"E");
		System.out.println(pl2);
		
		System.out.println("remove D");
		pl2.remove("D");
		System.out.println(pl2);
		
		System.out.println("\n");
		in.close();
		
		
		 Polyline.PolylineIterator polyIter = pl1.new PolylineIterator();
		 while (polyIter.hasVertex()) {
			 System.out.println(polyIter.vertex());
			 polyIter.advance();
		 }

	}
}
