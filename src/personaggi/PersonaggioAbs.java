package personaggi;

import java.util.Random;

public abstract class PersonaggioAbs implements Personaggio {
	
	public String nome;
	public int vita;
	public int forza;
	public double coeffAttacco;

	
public PersonaggioAbs(String nome, int vita, int forza, double d) {
		
		super();
		this.nome = nome;
		this.vita = vita;
		this.forza = forza;
		this.coeffAttacco = d;
		
	}	
	
	
public void combatti(Personaggio p) {	
	
	
		Personaggio attaccante = this.getClass().cast(this);
		Personaggio difensore = p.getClass().cast(p);		
	
		String attaccanteNome = attaccante.getNome();
		String difensoreNome = difensore.getNome();
		
		//double coeffAttacco = this.getClass().cast(this).coeffAttacco;
		double coeffAttacco = attaccante.getCoeffAttacco();
		
		
		
		if (difensore.getVita() > 0) {
			if(attaccante.getVita() > 0) {
				if(attaccante.getForza() > 0){				
					
					System.out.print( attaccanteNome ); 
					
					System.out.print(" contro ");
					
					System.out.println( difensoreNome );
					
					attaccante.controlloValori(difensore);
					
					Random x = new Random();
					
					Float rnd = x.nextFloat((float) coeffAttacco);
					
					System.out.println(" " + rnd + " ");
										
					int vita = (int) ( difensore.getVita() - ( Math.abs( attaccante.getForza()) * rnd));
					
					System.out.println("\n----------attacco--------------");				
					
					int forza = attaccante.getForza() - 3;					
					
					difensore.setVita(vita);
					
					attaccante.setForza(forza);			
					
					attaccante.controlloValori(difensore);
						
					}else {
						
						System.out.println("Sei esausto riposati ");
						
						attaccante.riposati();
						
					}
				}else {
					System.out.println("non puoi attaccare sei morto");
				}
			}else {
				System.out.println("Più morto di cosi non si può");
			}
			
		}

	public void controlloValori(Personaggio p) {
		
		Personaggio attaccante = this.getClass().cast(this);
		Personaggio difensore = p.getClass().cast(p);
		
		String attaccanteNome = attaccante.getNome();
		String difensoreNome = difensore.getNome();
		
		
		System.out.print("Forza " + attaccanteNome + " :" + attaccante.getForza());
		System.out.print(" - Forza " + difensoreNome + " :" + difensore.getForza());
				
		System.out.print("\nvita " + attaccanteNome + " : " + ( ( attaccante.getVita()) ) );
		System.out.print(" vita " + difensoreNome + " : " + ( difensore.getVita() ) );
	}
	
	
	public void riposati() {
		
		this.setForza( Math.abs( this.getForza()) + 5);
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}
