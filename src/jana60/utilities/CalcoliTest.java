package jana60.utilities;

public class CalcoliTest {

	public static void main(String[] args) {		
			//esercizio classico
		    System.out.println("La somma dei due numeri � " + CalcoliHelper.somma(10, 20));
		    System.out.println("La differenza tra i due numeri con a maggiore di b � " + CalcoliHelper.differenza(50, 30));
		    System.out.println("La differenza tra i due numeri con b maggiore di a � " + CalcoliHelper.differenza(10, 30));
		    System.out.println("Il prodotto dei numeri dati � " + CalcoliHelper.prodotto(30, 20));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(-40));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(60));
		    System.out.println("Il pi� piccolo tra i due numeri � " + CalcoliHelper.minimo(10, 5));
		    System.out.println("Il pi� grande tra i due numeri � " + CalcoliHelper.massimo(10, 6));
		    
		    System.out.println("\n");
		    //Bonus 1, metodo Overload
		    System.out.println("La somma dei due numeri � " + CalcoliHelper.somma(10.3, 20.65));
		    System.out.println("La differenza tra i due numeri con a maggiore di b � " + CalcoliHelper.differenza(50.17, 30.21));
		    System.out.println("La differenza tra i due numeri con b maggiore di a � " + CalcoliHelper.differenza(10.86, 30.23));
		    System.out.println("Il prodotto dei numeri dati � " + CalcoliHelper.prodotto(30.81, 20.12));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(-40.23));
		    System.out.println("Calcolo del valore assoluto del numero " + CalcoliHelper.valoreAssoluto(60.64));
		    System.out.println("Il pi� piccolo tra i due numeri � " + CalcoliHelper.minimo(10.12, 5.34));
		    System.out.println("Il pi� grande tra i due numeri � " + CalcoliHelper.massimo(10.67, 6.88));
		    
		    System.out.println("\n");
		    
		    //Bonus 2
		    System.out.println("Il risultato di base n ed esponente 0 � " + CalcoliHelper.potenza(2, 0));
		    System.out.println("Il risultato di base 0 ed esponente n � " + CalcoliHelper.potenza(0, 5));
		    System.out.println("Il risultato di base n ed esponente n � " + CalcoliHelper.potenza(10, 3));
		    System.out.println("Il risultato di base negativo ed esponente n � " + CalcoliHelper.potenza(-10, 3));
		    System.out.println("Il risultato di base n ed esponente negativo � " + CalcoliHelper.potenza(10, -3));
		  }

	}


