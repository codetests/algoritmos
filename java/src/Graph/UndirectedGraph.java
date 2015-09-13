package Graph;

public class UndirectedGraph {

	public static  String adjList[] = new String[15];
	public static  Integer listSize = 0;
	
	public static void main(String[] args) {
		
		// Input: [ [0,1], [0,6], [0,8], [1,4], [1,6], [1,9], [2,4], [2,6], [3,4], [3,5], [3,8], [4,5], [4,9], [7,8], [7,9] ]
		
		for (int i = 0; i < adjList.length; i++) adjList[i] = "";
		
		addVertex(0, "1");
		addVertex(0, "6");
		addVertex(0, "8");
		addVertex(1, "4");
		addVertex(1, "6");
		addVertex(1, "9");
		addVertex(2, "4");
		addVertex(2, "6");
		addVertex(3, "4");
		addVertex(3, "5");
		addVertex(3, "8");
		addVertex(4, "5");
		addVertex(4, "9");
		addVertex(7, "8");
		addVertex(7, "9");
		
		printGraphList();
		
	}

	public static void addVertex(int pos, String value) {
		
		int posInv = Integer.parseInt(value);
		
		adjList[pos] = ("".equals(adjList[pos])) ? "" + value : adjList[pos] + "," + value;
		adjList[posInv] = ("".equals(adjList[posInv])) ? "" + pos : adjList[posInv] + "," + pos;
	}
	
	public static void printGraphList() {
		for (int i = 0; i < adjList.length; i++)
			System.out.println(i + ": " + adjList[i]);
	}
	
}
