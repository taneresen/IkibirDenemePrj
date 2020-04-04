
public class IfOrnek {

	public static void main(String[] args) {
		int sayi1 = 12;
		int sayi2 = 9;
		
		
		if (sayi1 == sayi2)
			System.out.println("Iki sayi Esittir");
		else if (sayi1 != sayi2)
			System.out.println("Iki sayi Esit degildir");
		else if (sayi1 < sayi2)
			System.out.println("Sayi1 Sayi2 den kucuktur");
		else if (sayi1 > sayi2)
			System.out.println("Sayi1 Sayi2 den buyuktur");
		else if (sayi1 <= sayi2)
			System.out.println("Sayi1 Sayi2 den kucuk esittir");
		else if (sayi1 >= sayi2)
			System.out.println("Sayi1 buyuk esittir sayi2 den");
	}

}
