import java.util.Scanner;

//SayiTopla.java
//Kullanicidan komut satirinda iki sayi isteyip 
//toplamini yine komut satirinda yazdiracagiz
//Taner Esen - 21.04.2018

public class SayiTopla {

	public static void main(String[] args) {
		int sayi1;
		int sayi2;
		int toplam;
		
		Scanner input = new Scanner(System.in); //Scanner sınıfı kullanıcıdan veri almamıza olanak sağlayan bir sınıftır. 
		
		System.out.print("ilk Sayiyi Giriniz: ");
		sayi1 = input.nextInt();
		
		System.out.print("Ikinci Sayiyi Giriniz: ");
		sayi2 = input.nextInt();
		
		toplam = sayi1 + sayi2;
		System.out.println("Iki sayinin Toplami: "+toplam);
		
		if (toplam == 10)
			System.out.println("Tam 10 tutturdun");
		else
			System.out.println("Toplam 10 tutturamadin bea");
		

}

}
