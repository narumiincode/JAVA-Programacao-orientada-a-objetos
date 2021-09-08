package P.O.O;

public class EX3classeeletronicos {
	
	private String produto;
	private String clientealvo;
	
	public EX3classeeletronicos (String primeiro, String segundo)
	{
		produto=primeiro;
		clientealvo=segundo;
	}
	public String getmarketing()
	{
		String marketing=produto+clientealvo;
		return marketing;
	}
	
}
