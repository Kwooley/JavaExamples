public class mode2 {
	static int findmode(int[] numbers) {
		final int N = 10;
		int[] count = new int[N];
		int freq, maxcount;

		for (int i = 0; i < numbers.length; i++) {
			count[numbers[i]] += 1;
		}

		freq = 0;
		maxcount = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > maxcount) {
				maxcount = count[i];
				freq = i;
			}
		}

		return freq;
	}

	public static void main(String[] args) {
		// int[] numbers = { 0, 1, 2, 3, 4, 3, 3, 3, 4, 2 };
		int[] numbers = { 0, 2, 1, 2, 3, 2, 1 };

		int ret = 0;

		ret = findmode(numbers);
		System.out.println(ret);
	}

}
