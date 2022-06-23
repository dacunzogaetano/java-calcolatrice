package jana60.utilities;

public class CalcoliHelper {
	
	
	
	//costruttore private cosi nel main non può essere istanziato un nuovo calcolo
	private CalcoliHelper() {	
	    
	  }
	
	  //somma
	  public static int somma(int a, int b) {
	    return a + b;
	  }
	  
	  //differenza
	  public static int differenza (int a, int b) {
		  if (a >= b) {
				return a - b;
			} else {
				return b - a;
			}
	  }
	  
	  //prodotto
	  public static int prodotto (int a, int b) {
			return a * b;
	  }
	  
	  //valore assoluto
	  public static int valoreAssoluto (int a) {
		  if (a >= 0) {
			  return a;
		  } else {
			  return -a;
		  }
	  }
	  
	  //numero minimo tra due
	  public static int minimo (int a, int b) {
		 if (a >= b) {
			  return b;
		 } else {
			  return a;
		 }
	  }
	  
	  //numero massimo tra due
	  public static int massimo (int a, int b) {
		  if (a >= b) {
			  return a;
		 } else {
			  return b;
		 }
	  }
	  
	  //Bonus 1
	  //overload che con lo stesso nome ma con parametri diversi, sovrascrive i calcoli di prima
	  
	//somma double
	  public static double somma(double a, double b) {
	    return a + b;
	  }
	  
	  //differenza double
	  public static double differenza (double a, double b) {
		  if (a >= b) {
				return a - b;
			} else {
				return b - a;
			}
	  }
	  
	  //prodotto double
	  public static double prodotto (double a, double b) {
			return a * b;
	  }
	  
	  //valore assoluto double
	  public static double valoreAssoluto (double a) {
		  if (a >= 0) {
			  return a;
		  } else {
			  return -a;
		  }
	  }
	  
	  //numero minimo tra due double
	  public static double minimo (double a, double b) {
		 if (a >= b) {
			  return b;
		 } else {
			  return a;
		 }
	  }
	  
	  //numero massimo tra due double
	  public static double massimo (double a, double b) {
		  if (a >= b) {
			  return a;
		 } else {
			  return b;
		 }
	  }
	  
	 /* aggiungete il metodo per l’elevamento a potenza che prende come parametri due numeri interi (base ed esponente) e ritorna la base elevata all’esponente.
	   Occhio che sia la base che l’esponente potrebbero essere uguali a zero oppure numeri negativi!
	    (caso esponente = 0 e base = 0 anche se in matematica sarebbe un numero indefinito usiamo l’approccio informatico che lo calcola come 1)  */
	 
	  static int potenza(int base, int esponente){
	        int risultato = 1;
	        if(base > 0 && esponente==0){
	            return 1;
	        }
	        else if(base == 0 && esponente >=1){
	            return 0;
	        }
	        else{
	            for(int i = 1; i<= esponente; i++){
	                risultato *= base;
	            }
	            return risultato;
	        }
	    }
			
			
		
	  
	  
	  
	  
}