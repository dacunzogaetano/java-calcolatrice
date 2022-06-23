package jana60.utilities;

public class CalcoliTest {

	public static void main(String[] args) {		

		    System.out.println("La somma dei due numeri � " + CalcoliHelper.somma(10, 20));
		    System.out.println("La differenza tra i due numeri con a maggiore di b � " + CalcoliHelper.differenza(50, 30));
		    System.out.println("La differenza tra i due numeri con b maggiore di a � " + CalcoliHelper.differenza(10, 30));
		    System.out.println("Il prodotto dei numeri dati � " + CalcoliHelper.prodotto(30, 20));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(-40));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(60));
		    System.out.println("Il pi� piccolo tra i due numeri � " + CalcoliHelper.minimo(10, 5));
		    System.out.println("Il pi� grande tra i due numeri � " + CalcoliHelper.massimo(10, 6));

		  }

	}


