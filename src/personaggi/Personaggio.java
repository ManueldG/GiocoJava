package personaggi;

public interface Personaggio {
	
	public double getCoeffAttacco();
	
	public void setCoeffAttacco(double coeffAttacco);
	
	public int getVita();
	
	public int getForza();
	
	public void riposati();

	void setVita(int vita);
	
	void setForza(int forza);
	
	void combatti(Personaggio p);

	public void controlloValori(Personaggio difensore);

	public String getNome();

}
