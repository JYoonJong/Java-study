
public class ArrayExam1 {

	public static void main(String[] args) {
		
		int arrayInt[] = new int[10]; // 10�� ������ 0~9������ ���ڸ� ��Ƴ��� ���� // index ���� 
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
