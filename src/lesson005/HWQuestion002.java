package lesson005;

public class HWQuestion002 {

	public static void main(String[] args) {
		// 2
		// Bir dizide en büyük ikinci sayıyı bulan program
		int nums[] = { 1, 13, 13, 1, 2, 5, 13, 1, 8 };
		
		int enBuyuk = nums[0];
		int ikinci = nums[0];
		for (int i=0;i<nums.length;i++) {
			if (nums[i]>enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = nums[i];
			}else if (nums[i]>ikinci && nums[i] != enBuyuk){
				ikinci = nums[i];
			}
		}
		System.out.println("Dizideki en büyük ikinci sayı: " + ikinci);

	}

}
