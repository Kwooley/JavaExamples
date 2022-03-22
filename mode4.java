import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mode4 {
	static int findmode(int[] numbers) {
		int freq = -1;
		int cnt, maxcnt;

		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			if (hashmap.containsKey(numbers[i])) {
				cnt = hashmap.get(numbers[i]) + 1;
				hashmap.put(numbers[i], cnt);
			} else {
				hashmap.put(numbers[i], 1);
			}
		}
		maxcnt = 0;
		for (Entry<Integer, Integer> val : hashmap.entrySet()) {
			if (val.getValue() > maxcnt) {
				maxcnt = val.getValue();
				freq = val.getKey();
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
