package Recursividade;


public class test {

	public static void main(String[] args) {
		Fatorial fat = new Fatorial();
		
		int valor = 3;
		
		int resultado = fat.fatorialRecursivo(valor);
		
		System.out.println("FATORIAL DE " + valor + " = " + resultado);
	}

}
