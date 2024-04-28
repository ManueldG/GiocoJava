package personaggi;

public class Vampiro extends PersonaggioAbs implements Mostro  {
	
	
	public Vampiro(String nome, int vita, int forza, double d) {
		
		super(nome,vita, forza, d);
		
		
	}	
	
	@Override
	public void azzanna() {
		if(vita > 0) {
			
			forza = forza - 2;
			
		}

	}	
	
	@Override
	public void riposati() {
		
		this.vita += 5;
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
	public int getForza() {
		
		return this.forza;		

	}
	
	@Override
	public int getVita() {
		
		return this.vita;
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
