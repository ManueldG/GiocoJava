package personaggi;

public class Eroe extends PersonaggioAbs implements Umano {
		
	public Eroe(String nome, int vita, int forza,double d) {
		
		super(nome,vita, forza, d);		
		
	}

	@Override
	public int getForza() {
		
		return this.forza;		

	}

	@Override
	public int getVita() {
		
		return this.vita;
	}

	@Override
	public void setVita(int vita) {
		
		this.vita = vita;
		
	}

	@Override
	public void setForza(int forza) {
		
		this.forza = forza;
		
	}

	@Override
	public double getCoeffAttacco() {
		
		return this.coeffAttacco;
	}

	@Override
	public void setCoeffAttacco(double coeffAttacco) {
		
		this.coeffAttacco = coeffAttacco;
		
	}

	

	

}
