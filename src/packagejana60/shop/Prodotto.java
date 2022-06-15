package packagejana60.shop;
import java.text.DecimalFormat;
public class Prodotto {
	String marca,nome;
	float prezzo;
	int Iva;
	DecimalFormat df= new DecimalFormat("#.00€");
	public Prodotto() {}
	public Prodotto(String marca, String nome, float prezzo, int iva) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.Iva = iva;
	}
	public float prezzoTotale() 
	{
      return prezzo+((prezzo/100)*Iva);
	}
	public String toString()
	{ return "Il prezzo del prodotto "+nome  +"di marca  "+marca+ "  è  " +df.format(prezzoTotale());
	
	}
}