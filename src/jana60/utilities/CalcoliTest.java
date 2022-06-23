package jana60.utilities;

public class CalcoliTest {

	public static void main(String[] args) {		

		    System.out.println("La somma dei due numeri è " + CalcoliHelper.somma(10, 20));
		    System.out.println("La differenza tra i due numeri con a maggiore di b è " + CalcoliHelper.differenza(50, 30));
		    System.out.println("La differenza tra i due numeri con b maggiore di a è " + CalcoliHelper.differenza(10, 30));
		    System.out.println("Il prodotto dei numeri dati è " + CalcoliHelper.prodotto(30, 20));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(-40));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(60));
		    System.out.println("Il più piccolo tra i due numeri è " + CalcoliHelper.minimo(10, 5));
		    System.out.println("Il più grande tra i due numeri è " + CalcoliHelper.massimo(10, 6));

		  }

	}


