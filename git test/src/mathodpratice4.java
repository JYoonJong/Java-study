
public class mathodpratice4 {

	public static String number(int a , int b) {
		int i = a;
		String output = "";
		while(i<b) {
			output += i;
			i++;
		}		
		return output;
	}
	public static void main(String[] args) {
		String result = number(1,5);
		System.out.println(result);
		
	}
	
	
	
}
