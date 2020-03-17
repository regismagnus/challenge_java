package challenge;

import java.util.Arrays;

/**
 * Some people are standing in a row in a park. There are trees between them which cannot be moved.
 * Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
 * People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 * @author regis
 *
 */
public class SortByHeight {
	public static void main(String[] args) {
		int[] input = {-1, 190, 180, 170, -1, -1, 160, 150};
		System.out.println(Arrays.toString(sortByHeight(input)));
		
	}
	
	static int[] sortByHeight(int[] a) {
	    int aux;
	    for(int i=0; i<a.length; i++) {
	        if(a[i]==-1) 
	            continue;
	        
	        for(int b=0; b < a.length; b++) {
	            if(a[b]!=-1 && a[b]>a[i]) {
	                aux = a[i];
	                a[i] = a[b];
	                a[b] = aux;
	            }
	        }
	    }
	    return a;
	}

}
