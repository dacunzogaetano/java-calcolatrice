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
	  
	  
	  
	  
	  
}