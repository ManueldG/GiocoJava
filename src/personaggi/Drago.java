package personaggi;

public class Drago extends Vampiro {

	private boolean volo;

	public Drago(String nome, int vita, int forza, double d, boolean volo) {
		
		super(nome, vita, forza, d);
		
		this.volo = volo;
		
		this.vita = ( (this.volo = volo) ? (vita + 5 ): vita);	
		
	}
	
	public boolean isVolo() {
		
		return volo;
		
	}

	public void setVolo(boolean volo) {
		
		this.volo = volo;
		
	}


}
