package packagejana60.shop;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Prodotto[] prodotti= new Prodotto[4];
		Prodotto schiumaDaBarba=new Prodotto("Gillette","Schiuma da barba ",3.99f,22);
		Prodotto dentifricio =new Prodotto("Colgate","Dentifricio ",1.99f,22);
		Prodotto shampoo=new Prodotto("Garnier","Shampoo ",2.00f,22);
		Prodotto bagnoSchiuma =new Prodotto("Vidal","bagnoSchiuma ",1.00f,22);
		
		
		prodotti[0]=schiumaDaBarba;
		prodotti[1]=dentifricio;
		prodotti[2]=shampoo;
		prodotti[3]=bagnoSchiuma;
		
		
	for (int i=0;i<prodotti.length;i++)
	{
		System.out.println(prodotti[i].toString());
		
	}
	}


}
