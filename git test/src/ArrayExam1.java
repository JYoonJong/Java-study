
public class ArrayExam1 {

	public static void main(String[] args) {
		
		int arrayInt[] = new int[10]; // 10을 넣으면 0~9까지의 숫자를 담아내고 있음 // index 개념 
		for(int i = 0; i < arrayInt.length; i++) {
			System.out.println(i);
		}		
		int arrayInt2[] = {1,3,5,7,9};
		for(int i = 0; i < arrayInt2.length; i++) {
			System.out.println(i);
		}		
		int arrayInt3[] = {1,3,5,7,9};
		for (int i = 0; i < arrayInt3.length; i++) {
			System.out.println(arrayInt3[i]);
		}		
		String arrayStr[] = {"a","b","c","d","e"};
		for (int i = 0; i < arrayStr.length; i++) {
			System.out.println(arrayStr[i]);
		}
	}
}
