import java.util.Arrays;

public class mode3 {
	static int findmode(int[] numbers) {
		int freq;
		int count, maxcount;

		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		count = maxcount = 1;
		freq = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i - 1])
				count += 1;
			else
				count = 1;
			if (maxcount < count) {
				maxcount = count;
				freq = numbers[i];
			}
		}
		return freq;
	}

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 3, 3, 3, 4, 2 };

		int ret = 0;

		ret = findmode(numbers);
		System.out.println(ret);
	}

}
