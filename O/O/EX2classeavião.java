package P.O.O;

public class EX2classeavi�o {
	
	private String modelo;
	private String marca;
	private String anodefabricacao;
	private String civiloumilitar;
	private String pais;
	
	public EX2classeavi�o (String primeiro, String segundo,String terceiro, String quarto, String quinto)
	{
		modelo=primeiro;
		marca=segundo;
		anodefabricacao=terceiro;
		civiloumilitar=quarto;
		pais=quinto;
	}
	public String getHangar()
	{
		String Hangar=modelo+marca+anodefabricacao+civiloumilitar+pais;
		return Hangar;
	}
	
	
	
	

}
