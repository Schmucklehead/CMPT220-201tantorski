import java.util.ArrayList;

public class Problem13_3 {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();

	//List of Numbers
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(47);
		list.add(38);
		list.add(62);
		list.add(50);
		list.add(69);
		//Sorting Array
		sort(list);
		//Output Statement
		System.out.println(list.toString());
	}
	//Finding the minimum number
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			Number min = list.get(i);
			int minIndex = i;

		for (int j = i + 1; j < list.size(); j++) {
			//comparing minimum to other numbers
			if (min.doubleValue() > list.get(j).doubleValue()) {
				min = list.get(j);
				minIndex = j;
				}
			}
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
	}
}