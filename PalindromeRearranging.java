package challenge;

/**
 * Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.


 * 
 * best solution by samantha_p5:
 * int map = 0;
    for(int i=0; i<inputString.length(); i++) {
        map ^= 1 << (inputString.charAt(i) - 'a');
    }
    return map == 0 || (map & -map) == map;
 * @author regis
 *
 */
public class PalindromeRearranging {
	public static void main(String[] args) {
		System.out.println(palindromeRearranging("abbcabbss"));
	}
	
	static boolean palindromeRearranging(String inputString) {
		StringBuffer s = new StringBuffer(inputString);
		Boolean hasOdd = s.length()%2==0;
		long count;
	    
	    while(s.length()>0) {
	    	count = s.codePoints().filter(ch -> ch == s.charAt(0)).count();
	        if(count%2!=0)
	        	if(hasOdd)
	        		return false;
	        	else
	        		hasOdd=true;
	        String aux = s.toString().replaceAll(String.valueOf(s.charAt(0)), "");
	        
	        s.setLength(0);
        	s.append(aux);	   
	    }

	    return true;
	}
}
