/* 
You are given an array with duplicates. You have to sort the array with decreasing frequency of elements. If two elements have the same frequency, sort them by their actual value in increasing order.
Ex: [2 3 5 3 7 9 5 3 7]
Output: [3 3 3 5 5 7 7 2 9]
*/

package misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		Integer[] input = new Integer[] { 2,3,5,3,7,9,5,3,7 };
		// Sort the array using custom comparator
		Arrays.sort(input, new FrequencyComparator(input));
		// Print the result
		for (Integer i : input)
			System.out.print(i + " ");
	}
	
	static class FrequencyComparator implements Comparator<Integer>
    {            
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		public FrequencyComparator(Integer[] input) {
			for (Integer i : input) {
				frequencyMap.put(i, frequencyMap.get(i) != null ? frequencyMap.get(i) + 1 : 1);
			}
		}
		
		@Override
		public int compare(Integer i1, Integer i2) {
			// If frequencies are the same then compare the actual numbers
			if (frequencyMap.get(i1) == frequencyMap.get(i2)) 
				return i1.compareTo(i2);

			return (frequencyMap.get(i1) < frequencyMap.get(i2)) ? 1 : -1;
		}
     }

}
