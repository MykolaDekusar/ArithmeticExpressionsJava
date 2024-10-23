package def;

public class Main {

	public static void main(String[] args) {
		
		/*come nella maggior parte dei linguaggi di programmazione abbiamo
		 * i seguenti operatori: + - * / % (% sta per modulo e ci da 0 oppure 1 come risultato)
		 */
		int test = 10;
		test= test-1;
		//per sottrarre o aggiungere velocemente 1 basta scrivere il nome della variabile
		//seguito da -- oppure ++ Es:
		test--;
		test++;
		//se dividiamo un numero intero e ci viene come risulato un numero decimale i numeri
		//dopo la virgola verranno eliminati
		test= test/2; //dividiamo 9 con 2 ci dovrebbe dare 4.5, invece ci da 4 come risultato
		//per ovviare a questo problema dobbiamo specificare che è un float o un double
		float prova = 10;
		prova = prova /3;
		System.out.println(test);
		System.out.println(prova);
	}
}
