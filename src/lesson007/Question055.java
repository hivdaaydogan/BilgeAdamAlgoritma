package lesson007;

public class Question055 {

	public static void main(String[] args) {
		// Verilen arrayda en büyük ve en küçük değerleri bulan program
		String[] array = { "5", "2", "3", "4", "99", "85" };

		int[] array1 = new int[array.length];

		int eb = Integer.MIN_VALUE;
		int ek = Integer.MAX_VALUE;

		for (int i = 0; i < array1.length; i++) {
			array1[i] = Integer.valueOf(array[i]);
			if (array1[i] > eb) {
				eb = array1[i];
			}
			if (array1[i] < ek) {
				ek = array1[i];
			}

		}
		System.out.println("En buyuk: " + eb + " En kucuk: " + ek);

	}

}
