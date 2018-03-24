public class StackOfIntegers {
	private int[] factors;
	private int index;
	public static final int cap = 16;

	public StackOfIntegers() {
		this (cap);
	}

	public StackOfIntegers(int capacity) {
		factors = new int[capacity];
	}

	public void indexToTop(int value) {
		if (index >= factors.length) {
			int[] temp = new int[factors.length * 2];
			System.arraycopy(factors, 0, temp, 0, factors.length);
			factors = temp;
		}

		factors[index++] = value;
	}
	//Remove from list
	public int remove() {
		return factors[--index];
	}
	//first of list
	public int first() {
		return factors[index - 1];
	}
	//if empty
	public boolean empty() {
		return index == 0;
	}
	//size of list
	public int getSize() {
		return index;
	}
}