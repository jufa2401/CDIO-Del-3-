package boundary;
/**
 * Implementerer en tekstsk�rm
 *
 */
public class Screen {
	/**
	 * Udskriver tekst uden linieskift
	 * @param p tekst der skal udskrives
	 */
	protected void print(String p){
		System.out.print(p);
	}
	
	/**
	 * Udskriver tekst med linieskift
	 * @param p tekst der skal udskrives
	 */
	public static void println(final String p){
		System.out.println(p);
	}
}
