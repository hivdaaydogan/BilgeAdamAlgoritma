package lesson006;

public class Question049 {

	public static void main(String[] args) {
		// Matrisimizde bulunan tek sayıları farklı bir arrayin içine atalım
		int[][] matris = { 
				{ 56, 23, 678, 231, 5 },
				{ 234, 21, 78, 26, 6 },
				{ 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8},};
		
//		int[] tekArray = new int[matris.length * matris[0].length];
//		for (int i=0;i<matris.length;i++) {
//			for (int j=0;j<matris[i].length;j++) {
//				if (matris[i][j]%2!=0) {
//					tekArray[matris.length * matris[0].length]=matris[i][j];
//					System.out.print(tekArray[i]+ " ");
//					
//				}
//			}
//		}
		
		int[] tekArray = new int[matris.length * matris[0].length];
		
		for (int i=0;i<matris.length;i++) {
			for (int j=0;j<matris[i].length;j++) {
				if (matris[i][j]%2!=0) {
					tekArray[i]= matris[i][j];
					System.out.print(tekArray[i]+ " ");
				}
			}
			
		}
		
		

		

	}

}
