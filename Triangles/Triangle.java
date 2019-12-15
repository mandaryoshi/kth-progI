
public class Triangle {

	
	public static double area (double a, double b, double c) {
		double p = (a + b + c)/2;
		double A = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return A;
	}
	
	public static double area2 (double base, double altitude) {
		double f = base*altitude;
		double Area = f/2;
		return Area;
	}
	
	public static double circumcircle (double a, double b, double c) { 
		double denom = Math.sqrt((a+b+c)*(b+c-a)*(c+a-b)*(a+b-c));
		double radius = (a*b*c)/denom;
		return radius;
	}
	
	public static double incircle (double a, double b, double c) { 
		double p = (a + b + c)/2;
		double A = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		
		double radius = (2*A)/(2*p);
		return radius;
		
	}	
		
	public static double bisector (double b, double c, double alpha) {
	double p = 2 * b * c * Math.cos(alpha/2);
	double bis = p/(b + c);
	return bis;
	}
	
}
