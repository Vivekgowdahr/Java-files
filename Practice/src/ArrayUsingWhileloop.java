
public class ArrayUsingWhileloop {
	public static void main(String[] args) {
		int[] a = { 5, 6, 7, 8, 9, 10 };
		int i=0;
		int temp;
		
		while (i < a.length) {
			temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
			i += 2;
		}
		System.out.println("*************");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}