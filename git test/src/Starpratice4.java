import java.util.Scanner;

public class Starpratice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1; i <=n ; i++) {
			for(int j=1; j < i; j++) {
				System.out.print(" ");
				
			}
			for(int k=2*i-1; k <=2*n-1; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
