package Binary;

public class Dec2Bin {

	public static void main(String[] args) {
		
		int number = 15;
		
		printBinaryform(number);
	}

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }

        remainder = number % 2; System.out.println("number % 2: " + number % 2); System.out.println("number >> 1: " + (number >> 1));
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
	
}
