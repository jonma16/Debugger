
public class Factorial {
	public static void main( String[] args ) {
	      int numero = 9;
	      System.out.println( "El factorial de " + numero + " es: " + factoria( numero ) );      
	   }
	 
	   public static int factorial( int numero ) {
	      int fact = 1;
	      for( int i = 1; i <= numero; i++ ) {
	         fact *= i;
	      }
	 
	      return fact;
	   }
}
