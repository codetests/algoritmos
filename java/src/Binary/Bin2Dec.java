package Binary;

public class Bin2Dec {

	public static void main(String[] args) {
		
		String binary = "11110000";
		char vector[];
		
		vector = binary.toCharArray();
		
//		for () {
			int s = 0;
			for (int i = 0; i < vector.length; i++) {
				System.out.println("s = " + s + " | " + vector[i] + " " + (int)'0');
				s = (s * 2) + (vector[i] - '0');
			}
//		}
		System.out.println("-> " + s);
	}

}
