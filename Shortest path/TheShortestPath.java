
public class TheShortestPath {

		// The method intermediateStations returns an array of the intermediate stations that are on the shortest path .
		// The ordinal number of the first station is located in index 1 of the vector , and the second station on index 2.
		public static int [] intermediateStations ( double [] a, double [][] b, double [] c)
		{
			// distance through intermediate stations
			int n = a.length;
			int m = c.length;
			double [][] d = new double [n][m];
			
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					d[i][j] = (a[i] + b[i][j] + c[i]);
				}
			// the minimum distance and corresponding station
			double min = d [0][0];            
			int [] s = new int [2];      
			
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					if (d[i][j] < min) {
						min = d[i][j];
						s[1] = i;
						s[2] = j;
					}
				}
			return s;
		}
		
		// The method length returns the length of the shortest path .
		
		public static double length ( double [] a, double [][] b, double [] c)
		{

			int n = a.length;
			int m = c.length;
			double [][] d = new double [n][m];
						
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
						d[i][j] = (a[i] + b[i][j] + c[i]);
				}
			//determining the shortest distance
			double min = d [0][0];            
						     					
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					if (d[i][j] < min) {
						min = d[i][j];
						}
				}
			return min;
		}
		
}
