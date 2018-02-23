
public class Problem8_7 {

	public static void main(String[] args) {
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},                      
				{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},                          
				{5.5, 4, -0.5}};

			
			int point1 = 0, point2 = 1, point3 = 3; 
			double shortestDistance = distance(points[point1][0], points[point1][1], points[point1][2],
				points[point2][0], points[point2][point1], points[point3][point2]); // Initialize shortest Distance

		//every two point checker for distance
			for (int i = 0; i < points.length; i++) {
				for (int j = i + 1; j < points.length; j++) {
					double dist = distance(points[i][0], points[i][1], points[i][2],
						points[j][0], points[j][1], points[j][2]); // Find distance
					// make the new shortest the variable for the short variable
					if (shortestDistance > dist) {
						point1 = i; 
						point2 = j; 
						shortestDistance = dist; 
					}
				}
			}

			// Display result
			System.out.println("The closest two points are " +
				"(" + points[point1][0] + ", " + points[point1][1] + ") and (" +
					points[point2][0] + ", " + points[point2][1] + ")");
		}

		//between points distance
		public static double distance(
			double x1, double y1, double z1, double x2, double y2, double z2){
			double firstPart= Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2);
			return Math.sqrt(Math.pow(x2 - x1, 2) + firstPart); 
	         
		}

	}


