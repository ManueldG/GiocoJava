package personaggi;

import principale.Main;

public class Licantropo extends Vampiro implements Mostro,Umano { // esstende vampiro?  in main combaatte 2 volte
	
	protected boolean luna;
	
	public Licantropo(String nome, int vita, int forza, double coeffAttacco, boolean luna) {	
		
		super(nome, vita, forza, coeffAttacco);
						
		this.forza = ( (this.luna = luna) ? (forza + 5 ): forza);
				
	}

	public boolean isLuna() {
		return luna;
	}

	public void setLuna(boolean luna) {
		this.luna = luna;
	}
	
	
}
