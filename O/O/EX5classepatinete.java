package P.O.O;

public class EX5classepatinete {
	private String local;
	private String cor;
	
	public EX5classepatinete (String primeiro, String segundo)
	{
		local=primeiro;
		cor=segundo;
	}
	public String getaluguel()
	{
		String aluguel=local+cor;
		return aluguel;
	}

}
