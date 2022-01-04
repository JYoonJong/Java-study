
class Calculator4{
	static double PI = 3.14;
	static int base = 0;
	int left, right ;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left +this.right + base);
	}

	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}
}
public class Calculatorpratice3 {
	public static void main(String[] args) {
		Calculator4 c1 = new Calculator4();
		c1.setOprands(10,20);
		c1.sum();
		
		Calculator4 c2 = new Calculator4();
		c2.setOprands(20,40);
		c2.sum();
		
		Calculator4.base = 10;
		
		c1.sum();
		c2.sum();

	}

}
