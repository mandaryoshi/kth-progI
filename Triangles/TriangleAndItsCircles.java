import java.util.*;


public class TriangleAndItsCircles {

	public static void main(String[] args) {
		System.out.println("TRIANGLES \n");
		
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		
		double side[] = new double [3];
		
		for (int sides = 1; sides <= 3 ; sides ++) {
			System.out.println ("Side " + sides + ":");
				side[sides-1] = in.nextDouble ();
		}
		System.out.println();
		
		double angle[] = new double [3];
		
		for (int angles = 1; angles <= 1; angles++) {
			System.out.println("Enter your angle between the sides: ");
				angle[angles-1] = in.nextDouble();
		for (int ans = 2; ans <= 3; ans++){
			System.out.println("Enter your sides: ");
			angle [ans-1] = in.nextDouble();
		}
		in.close();
		}
		System.out.println();
		
		System.out.println("The area of the Triangle is: " + Triangle.area(side[0],side[1],side[2]));
		System.out.println("The radius of the circumcircle is: " + Triangle.circumcircle(side[0], side[1], side[2]));
		System.out.println("The radius of the incircle is: " + Triangle.incircle(side[0], side[1], side[2]));
		
		System.out.println();
		
		System.out.println("The length of the bisector is: " + Triangle.bisector(angle[1], angle[2], angle[0]));
	}
	

}
