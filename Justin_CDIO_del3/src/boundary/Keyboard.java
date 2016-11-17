package boundary;
import java.util.Scanner;

/** 
 * Implementerer input fra tastatur
 *
 */
public class Keyboard {
	private static Scanner in;
	public Keyboard() {
		in = new Scanner(System.in);
	}


	public String getString () {
		return in.nextLine();
	}

	public static boolean waitForYesNo(){
		String s;
		boolean yes = false; 

		s = in.nextLine();
		if (s.equalsIgnoreCase(ULang.YesChar())) {
			yes = true;
		}
		return yes;
	}
	/** Venter p� en int. Returnerer f�rst n�r brugeren indtaster den int der ventes p�
	 * @param ind int der ventes p�
	 */
	public void waitForInt(int ind){
		int temp;
		do {
			temp = in.nextInt();
		}while (!(ind==temp)); 
	}


	public void waitForEnter(){
		in.nextLine();
	}
}
