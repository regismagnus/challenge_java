package challenge;

import java.util.Arrays;

/**
Several people are standing in a row and need to be divided into two teams.
The first person goes into team 1, the second goes into team 2,
the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people.
Return an array of two integers, where the first element is the total weight of team 1, 
and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
alternatingSums(a) = [180, 105].
 * @author regis
 *
 */
public class AlternatingSums {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 50;
		a[1] = 60;
		a[2] = 60;
		a[3] = 45;
		a[4] = 70;
		System.out.println(Arrays.toString(alternatingSums(a)));	
	}
	
	public static int[] alternatingSums(int[] a) {
	    int[] t = new int[2];
	
	    t[0] = 0;
	    t[1] = 0;
	    for(int i=0; i<a.length; i++) {
	        if(i%2==0)
	            t[0]+=a[i];
	        else
	            t[1]+=a[i];
	    }
	
	    return t;
	}
}
