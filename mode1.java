public class mode1 {
	static int findmode(int[] numbers) {
		int freq;
		int maxcount = 0;

		freq = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j])
					count++;
			}
			if (maxcount < count) {
				maxcount = count;
				freq = numbers[i];
			}
		}

		return freq;
	}

	public static void main(String[] args) {
		int[] numbers = { 0, 2, 1, 2, 3, 2, 1 };
		// int[] numbers = { 0, 1, 2, 3, 4, 3, 3, 3, 4, 2 };

		int ret = 0;

		ret = findmode(numbers);
		System.out.println(ret);

	}

}
