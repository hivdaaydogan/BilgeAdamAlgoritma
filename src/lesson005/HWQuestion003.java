package lesson005;

public class HWQuestion003 {

	public static void main(String[] args) {
		// 3
		// Bir dizide eğer 13 var ise hem 13'ü hem de bir sonraki indexi
		// toplama işlemine almayacak
		// dizideki elemanların toplamını bulalım
		int nums[] = { 1, 13, 5, 13, 2, 5, 7, 1 };
		// 1 + 5 + 7 +1
		// toplam --> 1 + 5 = 6
		
		int toplam = 0;
		for (int i=0;i<nums.length;i++) {
			if (nums[i]==13) {
				i++;
			}else {
				toplam = toplam + nums[i];
			}
		}
		System.out.println("toplam: " + toplam);
		
		// iki tane 13 üst üste geldiğinde problemli bunu çözelim.
		// son eleman 13 ise problemli, bunu da çözelim.
	}

}
