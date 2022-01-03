
public class Calculatorpratice1 {
	
	public static void avg(int left, int light) {
		System.out.println((left+light)/2);
	}
	public static void sum(int left, int light) {
		System.out.println(left+light);
	}
	public static void main(String[] args) {
		int left, right;
		
		left = 10;
		right = 20;
		
		sum(left, right);
		avg(left, right);
		
		left = 20;
		right = 40;
		
		sum(left, right);
		avg(left, right);
		

	}

}
