import java.util.Arrays;

public class ArrayOrnek {

	public static void main(String[] args) {
		
		
		
		
		int sayilar[] = new int[6];
		
		sayilar[0] = 7;
		sayilar[1] = 13;
		sayilar[2] = -4;
		sayilar[3] = 17;
		sayilar[4] = 27;
		sayilar[5] = 37;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			System.out.print(sayilar[i]+" ");
			
		}
		
		System.out.println();
		
		// arrayda siralamayi görüyoruz
		Arrays.sort(sayilar);
		for (int i = 0; i < sayilar.length; i++) {
			
			System.out.print(sayilar[i]+" ");
			
			
		}
		
		System.out.println();
		
		// arrayde aramayi görüyoruz
		//Önemli: Arrayde arama yapabilmek icin önce mutlaka siralanacak
		
		
		Arrays.sort(sayilar);
		
		int indeks =Arrays.binarySearch(sayilar,17);
		
					
		System.out.println("Index"+indeks);
					

		
	}

}