
public class MyInteger {
	private int value;

	MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		return isEven(value); 
	}
	public boolean isOdd() {
		return isOdd(value); 
	}
	public boolean isPrime() {
		return isPrime(value);
	}

//seeing if even
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
//seeing if odd
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	//if num is prime
	public static boolean isPrime(int num) {
		for (int divisor = 2; divisor <= num / 2; divisor++) {
			if (num % divisor == 0)
				return false;
		}
		return true;
	}

//calling the method for below
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}


	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}


	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}

	
	public boolean equals(int value) {
		return this.value == value;
	}

	
	public boolean equals(MyInteger myInteger) {
		return myInteger.value == this.value;
	}

	
	public static int parseInt(char[] chars) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, chars.length - 1); 
			  i < chars.length; i++, j /= 10) {
			value += (chars[i]- 48) * j;
		}
		return value;
	}

	//into to int value
	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1); 
			  i < str.length(); i++, j /= 10) {
			value = value + (str.charAt(i) - 48) * j;
		}
		return value;
	}

}
