package Paciente;

public class Paciente 
{
	private String sNomePaciente;
	private long   lIdade;
	private String sDescricao;
	
	public String getNome() 
	{
		return sNomePaciente;
	}
	
	public void setNome(String nome) 
	{
		this.sNomePaciente = nome;
	}
	public long getIdade() 
	{
		return lIdade;
	}
	public void setIdade(long lIdade) 
	{
		this.lIdade = lIdade;
	}
	
	public String getDescricao() 
	{
		return sDescricao;
	}
	public void setDescricao(String sDescricao) 
	{
		this.sDescricao = sDescricao;
	}
}