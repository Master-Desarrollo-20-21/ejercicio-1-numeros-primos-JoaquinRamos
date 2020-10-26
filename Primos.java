package ejercicios;

public class Primos {

	public static void main(String[] args) {
		System.out.println("Hola");

		// Calcular los 50 n�meros primos
		System.out.println("La suma de los 50 primeros n�meros primos es: "+ calcular50PrimerosPrimos());
	
		// Calcular los n�meros primos que hay en los 50 primeros n�meros
		System.out.println("La suma de los 50 primeros n�meros primos es: "+ calcularPrimosEn50Numeros());
		
	}
	
	// Calcular los n�meros primos que hay en los 50 primeros n�meros
	public static int calcularPrimosEn50Numeros(){
		int suma = 0, i=0;
		
		while (i<50) {
			if (esPrimo(i)) {
				suma += i;
				//System.out.println("Primo " + i);
			}
			i++;
		}
		return suma;
		
	}
	
	// Calcular los 50 n�meros primos
	public static int calcular50PrimerosPrimos(){
		int suma = 0, contadorPrimos = 0, i=0;
		
		while (contadorPrimos<50) {
			if (esPrimo(i)) {
				suma += i;
				contadorPrimos++;
				//System.out.println("Primo " + i);
			}
			i++;
		}
		return suma;
		
	}
	
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  if (numero < 2) {
			  return false;
		  }
		  while (primo && contador!=numero){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	
}
