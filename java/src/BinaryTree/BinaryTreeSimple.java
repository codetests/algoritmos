package BinaryTree;

import java.util.Arrays;

public class BinaryTreeSimple {

	public static Integer v[] = new Integer[100];
	public static Integer size = 0;
	
	public static void main(String[] args) {
		
		insert(3);
		insert(4);
		insert(1);
		
		printTree();
	}

	private static Boolean insert(int value) {
		
		if (size == v.length) {
			return false;
		} else {
			
			v[size] = value;
			size++;
			
		}
		
		return true;
	}
	
	private static Integer getParent(int node) {
		
		if (node == 0) return getRoot();
		
		return (node-1) / 2;
	}
	
	private static Integer getLeftChild(int node) {
		return (2*node) + 1;
	}
	
	private static Integer getRightNode(int node) {
		return (2*node) + 2;
	}
	
	private static Integer getRoot() {		
		return v[0];
	}
	
	private static void printTree() {
		System.out.println(Arrays.toString(v));
	}
	
}
