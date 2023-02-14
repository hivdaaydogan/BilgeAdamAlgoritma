package maraton_1;
/*
 	* 1. Aşağıdaki şekli döngüler kullanarak ekrana çizdiren static metod yazınız ve 
 	* main içinden bu metodu çağırarak çalıştırınız:
 	*Programınız çalıştırıldığında konsola aşağıdaki görüntüyü çıkaracaktır:
 	*Program Run:
		*
		* *
		* * *
		* * * *
		* * * * *
		* * * * * *
		* * * * * * *
		* * * * * * *
		* * * * * * *
		* * * * * * *
 */

public class Question1 {
	
	public static void yildiz() {
		for(int i=0; i<6; i++)   
		{   
		for(int j=0; j<=i; j++)   
		{   
		System.out.print("* ");
		}
		System.out.println();
	}
		for (int i=1;i<=28;i++) {
			System.out.print("* ");
			if (i%7==0) {
				System.out.println();
			}
		}
}

	public static void main(String[] args) {
		
		yildiz();
		
		
	}
	
}	

