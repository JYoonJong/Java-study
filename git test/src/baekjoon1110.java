import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int temp = n;
		int cycle =0;
		
		
		while(true) {
			int a = temp / 10;
			int b = temp % 10;
			temp = b*10 + (a+b)%10;
			cycle++;
			if( temp == n) {
				break;
				
			}
		}
		System.out.println(cycle);	
				
		
			
	}
}
