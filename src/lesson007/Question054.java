package lesson007;

public class Question054 {

	public static void main(String[] args) {
		// Verilen dizide rakamların farkının en az olduğu sayıların farkını bulalım.
		
		int[] array2 = { 1, -10, -4, 3 };
		// mutlak değer alabiliriz
		// int mutlakDeger = Math.abs(0);
		
		int mins = Integer.MAX_VALUE;
		
		for (int i=0;i<array2.length;i++) {
			for (int j=i+1;j<array2.length;j++) {
				int fark=Math.abs(array2[i]-array2[j]);
				if(fark<mins) {
					mins = fark;
				}
			}
		}
		System.out.println(mins);


		
		
	

	}

}
