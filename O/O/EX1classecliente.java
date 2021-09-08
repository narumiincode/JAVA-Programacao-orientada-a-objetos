package P.O.O;

public class EX1classecliente {
	
	private String nome;
	private String mesdeaniversario;
	private String marcafavorita;
	private String email;
	
	public EX1classecliente (String primeiro, String segundo,String terceiro, String quarto)
	{
		nome=primeiro;
		mesdeaniversario=segundo;
		marcafavorita=terceiro;
		email=quarto;
	}
	
	public String getperfil()
	{
		String perfil=nome+" ; "+mesdeaniversario+" ; "+marcafavorita+" ; "+email;
		return perfil;
	}

	
}
