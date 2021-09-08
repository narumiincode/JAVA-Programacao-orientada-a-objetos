package P.O.O;

public class EX4classefuncionario {
	
	private String nomedofuncionario;
	private String cargo;
	private String setor;
	
	public EX4classefuncionario (String primeiro, String segundo,String terceiro)
	{
		nomedofuncionario=primeiro;
		cargo=segundo;
		setor=terceiro;
	}
	
	public String getperfil()
	{
		String perfil=nomedofuncionario+cargo+setor;
		return perfil;
	}

}
