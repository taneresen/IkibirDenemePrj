
// 1 den 10 a kadar olan sayilarin toplamini yazacagiz


public class WhileTopla {

	public static void main(String[] args) {
		
		int sayac=1;
		int toplam = 0;
		
		while (sayac <=10)
		{
			toplam=toplam+sayac;
			
			sayac++; // sayac = sayac +1 in k
		}
		
           System.out.println("Toplam:"+toplam);
	}

}