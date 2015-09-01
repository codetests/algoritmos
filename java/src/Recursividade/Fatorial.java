package Recursividade;


public class Fatorial {

	public int fatorialRecursivo(int num) {
		
		if (num == 1)
			return 1;
		
		return num * fatorialRecursivo(num - 1);
	}

}
