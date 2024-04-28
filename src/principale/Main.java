package principale;


import java.util.Random;
import java.util.Scanner;

import personaggi.Eroe;
import personaggi.Licantropo;
import personaggi.Personaggio;
import personaggi.Vampiro;
import personaggi.Drago;


public class Main { 
	// gestire forza vita e che combattano tra loro caricarlo su github usare classe random per scegliere i personaggi oppure sceliere chi attaccare
	//aggiungere metodo riposati
	
	Personaggio[] pers = new Personaggio[3];
	
	int forzaU = 10;
	int forzaM = 30;
	int vitaU = 40;
	int vitaM = 40;
	
	double coeffU = .9;
	double coeffM = .8;
	
	boolean luna = true;
	boolean volo = true;
	
	String genere = "";
	

	public Main() {
		
	}

	public static void main(String[] args) {		
		
		
			int personaggio = 0;
			
			Main m = new Main();
						
			for (int k=0 ; k < m.getPers().length ; k++) {	
				
				Scanner s = new Scanner(System.in);
				
				System.out.println("\nGenere");			
				
				m.genere = s.nextLine();
				
				System.out.println("scegli un personaggio" );
								
				System.out.println("""
						1) Eroe
						2) Licantropo
						3) Vampiro
						4) Drago
						""");			
				
				m.inserisciPersonaggi(k);
				
			}		
			
			int pos ;
			
			
			try (Scanner l = new Scanner(System.in)) {
				int attacca ;
				
				int k = 0;
						
				//for (int k = 1 ; k <= incontri ; k++) {
				while(true) {			
								
					pos = ( (k % 3)  );					
					
					if(( m.controlloVincitore(m.pers)!="")){
						System.out.println( "Ha vinto " + m.controlloVincitore(m.pers) );
						return;
					}
					
					if( m.pers[pos].getClass().cast(m.pers[pos]).getVita() > 0 ){		
					
							m.personaggi();
							
							System.out.println(( pos + 1 ) + ") " + m.pers[pos].getClass().cast(m.pers[pos]).getNome() + " è il tuo turno ");
							System.out.println(" Chi vuoi attaccare? " );
							
							attacca = l.nextInt() - 1;
							
							if( ( pos ) != ( attacca ) ) {
								
								k++;
								if( m.pers[pos].getClass().cast( m.pers[pos]).getVita() > 0){
									
									System.out.println("Turno: " + k);
								
									( m.pers[pos] ).getClass().cast( m.pers[pos] ) . combatti( m.pers[attacca] );
								}
								
								
								System.out.print("\n\n "  );				
							
						}
						else {
							
							System.out.println(" non puoi");
							
						}
					}
					else {
						k++;				
					}
					
				
			}
		}

	}
	
	public Personaggio[] getPers() {
		return pers;
	}

	public void setPers(Personaggio[] pers) {
		this.pers = pers;
	}
	
	public boolean isMale() {
		
		return this.genere.equalsIgnoreCase("m");
		
	}

	
	public Float rnd(int range) {
		
		Random x = new Random();
		
		Float rnd = x.nextFloat(range);
		
		return rnd;	
		
	}
	
	public static String getClassIn(Object o) {
		
		return o.getClass().getSimpleName();		
		
	}
	
	public String controlloVincitore(Personaggio[] pers) {
		
		int vita = 0;
		
		Personaggio vin;
		
		for (Personaggio p : pers) {
			
			
			vin = p.getClass().cast(p);
			
			if( vin.getVita() <= 0 )
				vita++;	
			
			
			if ( vita == 2 ) {
				
				if( vin.getVita() > 0 ) {
						
						return( vin.getNome() );
						
					}
						
				}		
			
		}
		
		return "";						
			
		}
	
		public void personaggi() {
			
			String eroe = this.pers[0].getNome();
			
			String licantropo = this.pers[1].getNome();
			
			String vampiro = this.pers[2].getNome();
			
			System.out.printf("\n");
			System.out.printf("""
					1) %s
					2) %s
					3) %s
					
					""", eroe , licantropo, vampiro);
			
		}
		
		public void scegliPersonaggio() {
										
					String tmp = "";
					
					int k = 1;
					
					for (Personaggio p : this.pers) {
						
						tmp += k + ") " + p.getNome();
						k++;
						
					}
					
					System.out.printf(tmp + "\n");
					
				}
		
		public void inserisciPersonaggi(int pos) {
			
			Scanner l = new Scanner(System.in);				
				
			Integer scelta;							
					
			System.out.println("\n\nPersonaggio?");
			
					
			while( true ) {
				
			scelta = Integer.valueOf(l.nextLine())  ; 
										
			switch(scelta) {
					
			case 1:
				this.pers[pos] = new Eroe( this.isMale()  ? "Aragorn" : "Arwen",this.vitaU,this.forzaU,this.coeffU);
				System.out.println("Ciao " + this.pers[pos].getNome());
				return;
						
			case 2:						
					this.pers[pos] = new Licantropo( this.isMale() ? "Wolverine" : "Death Strike"  ,this.vitaM,this.forzaM,this.coeffM,this.luna);
					System.out.println("Ciao " + this.pers[pos].getNome());
					return;
						
				case 3:
					this.pers[pos] = new Vampiro( this.isMale() ? "Blade" : "Nyssa",this.vitaM,this.forzaM,this.coeffM);
					System.out.println("Ciao " + this.pers[pos].getNome());
					return;
						
				case 4:
					this.pers[pos] = new Drago( this.isMale()? "Furia Buia" : "Sdentata",this.vitaM,this.forzaM,this.coeffM, this.volo);
					System.out.println("Ciao " + this.pers[pos].getNome());
					return;
						
				default:
					System.out.println("scelta non corretta");
					break;	
						
					}
				}
				
			}	
		
}

