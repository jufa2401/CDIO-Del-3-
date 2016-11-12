package boundary;

import entity.DiceCup;

/**
 * Implementerer et teksorienterert brugerinterface (TUI)
 * 
 * @author manyb
 * @version 1.0
 */

public class Out {
	private Screen s;
	public Out() {
		s = new Screen();
	}
	/** 
	 * Udskriver et linieskift
	 */
	public void linieSkift(){
		s.println(" ");
	}

	/** 
	 * Udskriver info om spil start
	 */
	public void spilstarter(){
		s.println("Spillet starter ");
		s.println(" ");
		
	}
	
	/**
	 * Udskriver info om spilleres navne og saldi
	 * @param p array med spillere
	 */
    public void startInfo(Spiller [] p){
		for (int i=0; i<p.length;i++){	
			s.println("Spiller nr:"+ (i+1) + " Navn: " +p[i].getNavn()+" Saldo: " + p[i].getSaldo()+ " ");
		}
		s.println(" ");
	}
    
    /**
     * Udskriver venter p� slag tekst
     * @param pNr spiller vi venter p�
     */
    public void venterPaaSlag(int pNr){
		s.println("***");
		s.println("Venter p� spiller " + (pNr+1) + ". Tast ENTER for at forts�tte");
	}
    
    /**
     * Udskriver rafleb�gers indhold
     * @param rafle rafleb�ger
     */
    public void visSlag(MatadorRafleBaeger rafle){
		s.println(rafle.toString());
	}

    
    /**
     * Udskriver spillers pointstatus
     * @param p spiller nummer
     */
    public void visSpilStatus (Spiller [] p){
    	s.print("Status: ");
    	for(int j = 0; j < p.length; j++){		
			s.print("Spiller " + (j+1) + ": " + p[j].getSaldo() + " *** "); 
		}
		s.println("");
	}
	
    /**
     * Udskriver sl� igen tekst
     * @param pNr spillernummer
     */
    public void visSlaaIgen(int pNr){
		s.println("Spiller " + (pNr) + ": Slog to ens tillykke. Du m� sl� igen");
	}
	
	
    /**
     * Udskriver vinder tekst
     * @param pNr spiller der vandt
     * @param p array med spillere
     */
	public void visSlutInfo(int pNr,Spiller [] p){
		s.println("");s.println("Spillet er slut. " + p[pNr].getNavn() + " vandt");
	
		
	}	
}
