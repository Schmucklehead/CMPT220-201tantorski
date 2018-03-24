
public class Problem10_3 {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, }; 

		
		System.out.println("\nTest if values are even using isEven(int):");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " " + MyInteger.isEven(nums[i]));
		}

		System.out.println("\nTest if values are odd using isOdd(int):");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " " + MyInteger.isOdd(nums[i]));
		}

		System.out.println("\nTest if values are prime using isPrime(int):");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " " + MyInteger.isPrime(nums[i]));
		}
		System.out.println("\nTest if values are even using isEven():");
		for (int i = 0; i < nums.length; i++) {
			MyInteger value = new MyInteger(nums[i]);
			System.out.println(value.getValue() + " " + value.isEven());
		}

		System.out.println("\nTest if values are odd using isOdd():");
		for (int i = 0; i < nums.length; i++) {
			MyInteger value = new MyInteger(nums[i]);
			System.out.println(value.getValue() + " " + value.isOdd());
		}

		System.out.println("\nTest if values are prime using isPrime():");
		for (int i = 0; i < nums.length; i++) {
		
			MyInteger value = new MyInteger(nums[i]);
			System.out.println(value.getValue() + " " + value.isPrime());
		}

	
		System.out.println("\nTest if values are even using isEven(MyInteger):");
		for (int i = 0; i < nums.length; i++) {
			
			MyInteger value = new MyInteger(nums[i]);
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}

		System.out.println("\nTest if values are odd using isOdd(MyInteger):");
		for (int i = 0; i < nums.length; i++) {
						MyInteger value = new MyInteger(nums[i]);
			System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
		}

		System.out.println("\nTest if values are prime using isPrime(MyInteger):");
		for (int i = 0; i < nums.length; i++) {
			
			MyInteger value = new MyInteger(nums[i]);
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}

		
		int[] otherNUMS = {5, 9, 7};
		MyInteger value = new MyInteger(9);
		System.out.println("\nTest if " + value.getValue() + " is equal to the specified value:");
		for (int i = 0; i < otherNUMS.length; i++) {
			System.out.println(otherNUMS[i] + " " + value.equals(otherNUMS[i]));
		}

		System.out.println("\nTest if " + value.getValue() + " is equal to the specified value:");
		for (int i = 0; i < otherNUMS.length; i++) {
			MyInteger myInteger = new MyInteger(otherNUMS[i]);	
			System.out.println(otherNUMS[i] + " " + value.equals(myInteger));
		}

		
		System.out.println("\nTest parseInt(char[]) and parseInt(String):");
		
		char[] numChar = {'1', '2', '3'};

	
		String numericString = "500";
		System.out.print("\'");
		for (int i = 0; i < numChar.length; i++) {
		 	System.out.print(numChar[i] + "");
		} 
		System.out.println("\' + \"" + numericString + "\" = " + (MyInteger.parseInt(numChar) + MyInteger.parseInt(numericString)));
		

	}

}
