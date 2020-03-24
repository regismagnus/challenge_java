package challenge;

import java.util.Arrays;

/**
 * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

Example

For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].

 * best solution by dariusz_k1:
 *     return Arrays.stream(inputArray)
    .map(o -> o == elemToReplace ? substitutionElem : o)
       .toArray();
 * @author regis
 *
 */
public class ArrayReplace {
	public static void main(String[] args) {
		int[] a = {1, 2, 13};
		
		System.out.println(Arrays.toString(arrayReplace(a, 1, 3)));
	}
	
	static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
	    for(int i = 0; i < inputArray.length; i++) {
	        if(inputArray[i]==elemToReplace)
	            inputArray[i] = substitutionElem;
	    }
	    return inputArray;
	}

}
