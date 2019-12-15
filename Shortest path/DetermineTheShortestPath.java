import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DetermineTheShortestPath {

	public static void main(String[] args) {

		System.out.println("The Shortest Path \n");
		
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Number of first stations: ");
		int u = in.nextInt();

		System.out.print("Number of second stations: ");
		int v = in.nextInt();
		
		
		double [] n = new double [u];
		double [][] t = new double [u][v];
		double [] m = new double [v];
		
		System.out.println();
		
		{
			for (int i = 0; i < u; i++)  {
				System.out.println("Length from X to U" + (i+1) + ":");
				n[i] = in.nextDouble();
			}
		
			for (int i = 0; i < u; i++) 
				for (int j = 0; j < v; j++) {
					System.out.println("Length from U" + (i+1) + " to V" + (j+1));
					t[i][j] = in.nextDouble(); 
			}
			
			for (int i = 0; i < v; i++)  {
				System.out.println("Length from V" + (i+1) + " to Y");
				m[i] = in.nextDouble();
			}
			in.close();
		}
		System.out.println();
		System.out.println("The quickest stations are: " + Arrays.toString(TheShortestPath.intermediateStations(n, t, m)));
		
		System.out.println();
		System.out.println("The shortest length is: " + TheShortestPath.length(n, t, m));
	
		
	}

}
