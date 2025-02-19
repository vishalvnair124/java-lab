package array;

class Minarray {
	public static void main(String[] args) {
		int[] array = { 20, 19, 1, 5, 71, 27, 19, 95 };
		int min = array[0]; // initialize the current minimum
		for (int index = 0; index < array.length; index++)
			if (array[index] < min)
				min = array[index];
		System.out.println("The minimum of this array is: " + min);
	}
}

// clone(): Creates a shallow copy of the array.
// length: Returns the length of the array.
// equals(Object array): Compares the array to another array for equality.
// toString(): Converts the array to a string representation.
// copyOf(int[] original, int newLength): Copies the specified array, truncating
// or padding with zeros (if necessary) so the copy has the specified length.
// copyOfRange(int[] original, int from, int to): Copies the specified range of
// the specified array into a new array.
// fill(int[] array, int value): Assigns the specified int value to each element
// of the specified array.
// sort(int[] a): Sorts the specified array into ascending numerical order.
// binarySearch(int[] a, int key): Searches the specified array of ints for the
// specified value using the binary search algorithm.
// asList(T... a): Returns a fixed-size list backed by the specified array.