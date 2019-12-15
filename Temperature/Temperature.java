import java.util.*;


public class Temperature 
{
	public static void main ( String [] args ) 
	{
		System.out.println("TEMPERATURES \n");
		
		// input tools
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		
		// enter the number of weeks and measurements
		System.out.print("Number of weeks: ");
		int nofWeeks = in.nextInt();


		System.out.print("Number of measurements per week: ");
		int nofMeasurementsPerWeek = in.nextInt();
	
		// storage space for temperature data
		double [][] t = new double [ nofWeeks + 1][ nofMeasurementsPerWeek + 1];
		
		// read the temperatures
		for (int week = 1; week <= nofWeeks ; week ++) {
			System.out.println ("Temperatures - Week " + week + ":");
			for (int reading = 1; reading <= nofMeasurementsPerWeek; reading++)
				t[week][reading] = in.nextDouble ();
		}
		System.out.println();
		
		// show the temperatures
		System.out.println ("The temperatures :");
		for (int week = 1; week <= nofWeeks ; week++) {
			for (int reading = 1; reading <= nofMeasurementsPerWeek; reading++)
				System.out.print (t[week][reading] + " ");
			System.out.println();
		}
		System.out.println();
		in.close();
		// the least , greatest and average temperature - weekly
		double [] minT = new double [ nofWeeks + 1];
		double [] maxT = new double [ nofWeeks + 1];
		double [] sumT = new double [ nofWeeks + 1];
		double [] avgT = new double [ nofWeeks + 1];
	
		// compute and store the least , greatest and average temperature for each week.     
		
		
		for (int i = 1; i < t.length; i++) {
			minT[i] = t[i][1];
			for (int j = 1; j < t[i].length; j++)
		            if (t[i][j] < minT[i])
		                minT[i] = t[i][j];
		        System.out.println("Minimum temperature of week " + i + " = " + minT[i] );
		}
		System.out.println();
		
		
		for ( int i = 1; i < t.length; i++ ) {
			maxT[i] = t[i][1];
			for ( int j = 1; j < t[i].length; j++ )
		            if (t[i][j] > maxT[i])
		                maxT[i] = t[i][j];
		        System.out.println("Maximum temperature of week " + i + " = " + maxT[i] );
		}
		System.out.println();
		
		
		for ( int i = 1; i < t.length; i++ ) {
			double sum = 0;
			for ( int j = 1; j < t[i].length; j++ ) {
				sum += t[i][j];
		           sumT[i] = sum;
			}
			avgT[i] = sumT[i] / (t[i].length-1);
			System.out.println ("Average temperature of week " + i + " is = " + avgT[i]);
		}
		System.out.println();
		
		// show the least , greatest and average temperature for each week
	
		
		
	
		// the least , greatest and average temperature - whole period
		double minTemp = minT [1];
		double maxTemp = maxT [1];
		//double sumTemp = sumT [1];
		double avgTemp = 0;
	
		// compute and store the least , greatest and average temperature for the whole period
	
		
		for (int i = 0; i < minT.length; i++) {
				if (minT[i] < minTemp);
					minTemp = minT[i];
			}

		for (int i = 0; i < maxT.length; i++) {
				if (maxT[i] > maxTemp);
					maxTemp = maxT[i];
			}
			
		for ( int i = 0; i < avgT.length; i++ ) {
			double sum = 0;
				sum += avgT[i];
		        sumT[i] = sum;
		}
			avgTemp = sumT[1] / avgT.length;
			
				
		
		// show the least , greatest and average temperature for the whole period
		System.out.println("Lowest temperature for the whole period is: " + minTemp);
		System.out.println("Highest temperature for the whole period is: " + maxTemp);
		System.out.println("Average temperature for the whole period is: " + avgTemp);
		
	}
	
}




