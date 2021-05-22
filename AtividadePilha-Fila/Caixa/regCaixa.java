package Caixa;

public class regCaixa 
{
	private String sIdentificador;
	private double dAltura;
	private double dLargura;
	private double dProfundidade;
	private boolean EhFragil;
	
	public String getIdentificador() {
		return sIdentificador;
	}
	
	public void setIdentificador(String sIdentificador) {
		this.sIdentificador = sIdentificador;
	}
	
	public double getAltura() 
	{
		return dAltura;
	}
	
	public void setAltura(double dAltura) 
	{
		this.dAltura = dAltura;
	}
	
	public double getLargura() 
	{
		return dLargura;
	}
	
	public void setLargura(double dLargura) 
	{
		this.dLargura = dLargura;
	}
	
	public double getProfundidade() 
	{
		return dProfundidade;
	}
	
	public void setProfundidade(double dProfundidade) 
	{
		this.dProfundidade = dProfundidade;
	}
	
	public boolean getFragil() 
	{
		return EhFragil;
	}
	
	public void setFragil(boolean EhFragil)
	{
		this.EhFragil = EhFragil;
	}
}
