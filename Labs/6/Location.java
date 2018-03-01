public class Location {
	int row;         	
	int column;			
	double maxValue;	

	//to see if where the location is the largest
	Location(double[][] a) {
		maxValue = a[0][0];
		row = 0;
		column = 0;
		//for loops to go through the length of a then the indexs of each
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// the the number is bigger make it the new max value and what the positon is
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
	}

}
