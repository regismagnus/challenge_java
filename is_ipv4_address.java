package challenge;

/**
 * An IP address is a numerical label assigned to each device (e.g., computer, printer) 
 * participating in a computer network that uses the Internet Protocol for communication.
There are two versions of the Internet protocol, and thus two versions of addresses.
One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;

For inputString = "172.316.254.1", the output should be
isIPv4Address(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
isIPv4Address(inputString) = false.

There is no first number.
 * best solution by pixelstorm:
 *     return inputString.matches("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");

 * @author regis
 *
 */
public class is_ipv4_address {
	public static void main(String[] args) {
		System.out.println(isIPv4Address("172.16.254.1"));
	}
	
	static boolean isIPv4Address(String inputString) {
	    String[] ipNums = inputString.split("\\.");
	    if(ipNums.length!=4)
	        return false;
	    
	    for(int i = 0; i < ipNums.length; i++) {
	        try {
		        if(ipNums[i].length() == 0 
		            || ipNums[i].length() > 3
		            || Integer.parseInt(ipNums[i]) > 255
		            || Integer.parseInt(ipNums[i]) < 0
		            || (Integer.parseInt(ipNums[i]) == 0 && ipNums[i].length() > 1)
		            || ipNums[i].replaceFirst("^0+(?!$)", "").length() != ipNums[i].length())
		            return false;
	        } catch(NumberFormatException e) {
	            return false;
	        }
	    }
	    
	    return true;
	}
}
