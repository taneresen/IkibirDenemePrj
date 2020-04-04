import javax.swing.JOptionPane;

public class GUIOrnek {

	public static void main(String[] args) {
		
  // JOptionPane.showMessageDialog(null, "Java \n Programlamaya \n Hosgeldiniz");

   String isim1 = "Bora";
   
   String isim2 = "Bora";
   
   String isim3 = new String ("Bora");
   
   String isim4  = new String ("Bora");
      
   
   if (isim1 == isim2)   	
	   
	   	System.out.println("isimler Esit");
   else
   		System.out.println("isimler esit Degil");
   
   
    if (isim3.equals(isim4)) //Stringlerin esit olup olmadigini surekli bu sekilde Kiyaslariz.
    	
    	System.out.println("Isimler Esit");
    else
    	System.out.println("isimler Esit Degil");
    
    //String isim =JOptionPane.showInputDialog("isminizi giriniz");
    
    //JOptionPane.showMessageDialog(null, "isminiz" + isim);
    
	}

}
