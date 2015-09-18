package Graph;

import java.util.Arrays;

public class UndirectedGraph {

	public static  String adjList[] = new String[15];
	public static  Integer visited[] = new  Integer[adjList.length];
	public static  Integer listSize = 0;
	
	public static void main(String[] args) {
		
		// Input: [ [0,1], [0,6], [0,8], [1,4], [1,6], [1,9], [2,4], [2,6], [3,4], [3,5], [3,8], [4,5], [4,9], [7,8], [7,9] ]
		
		for (int i = 0; i < adjList.length; i++) adjList[i] = "";
		for (int i = 0; i < visited.length; i++) visited[i] = 0;
		
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
		
		DFS(0);
		
	}

	// Busca em profundidade
	public static void DFS(int vertex) {
		
		visitVertex(vertex);
		
		for (String ver : getAdjVertexes(vertex)) {
			if (!isVisited(Integer.parseInt(ver)))
				DFS(Integer.parseInt(ver));
		}		
	}
	
	public static void visitVertex(int pos) {
		visited[pos] = 1;
		System.out.println("Visiting: " + pos);
	}
	
	public static Boolean isVisited(int vertex) {
		if (visited[vertex] == 0)
			return false;
		else
			return true;
	}
	
	public static String[] getAdjVertexes(int vertex) {
		
		String list = adjList[vertex];
		
		String vector[] = list.split(",");
		
//		System.out.println("getVertexes: " + vertex + " returning: " + Arrays.toString(vector));		
		
		return vector;
	}
	
	public static void addVertex(int pos, String value) {
		
		int posInv = Integer.parseInt(value);
		
		adjList[pos] = ("".equals(adjList[pos])) ? "" + value : adjList[pos] + "," + value;
		adjList[posInv] = ("".equals(adjList[posInv])) ? "" + pos : adjList[posInv] + "," + pos;
		
		if (pos > listSize)
			listSize = pos;
		
		if (posInv > listSize)
			listSize = posInv;		
	}
	
	public static void printGraphList() {
		for (int i = 0; i <= listSize; i++)
			System.out.println(i + ": " + adjList[i]);
	}
	
}
