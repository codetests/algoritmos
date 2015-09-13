package BinaryTree;

// ref.: http://www.algolist.net/Data_structures/Binary_heap

public class HeapMin_01basic {

	// Sample Tree:
	//				1
	//			 /	   \
	//			/		\
	//		   /		 \
	//		  /			  \
	//		3				6
	//	   / \			   /
	//	  /	  \			  /
	//	 /	   \		 /
	//	5		9		8
	
    private static Integer[] data = {1,3,6,5,9,8}; // <- Tree representation
    private static Integer heapSize = 6;
	
	public static void main(String[] args) {
		
		System.out.println("getMinimum: " + getMinimum());
		
		System.out.println("getLeftChildIndex: " + getLeftChildIndex(1) + " value: " + data[getLeftChildIndex(1)]);
		System.out.println("getRightChildIndex: " + getRightChildIndex(1) + " value: " + data[getRightChildIndex(1)]);
		System.out.println("getParentIndex: " + getParentIndex(1) + " value: " + data[getParentIndex(1)]);

	}

    public static Integer getMinimum() {
        if (isEmpty())
        	return null;
        else
        	return data[0];
    }

	public static boolean isEmpty() {
		return (heapSize == 0);
	}
	  
	private static int getLeftChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 1;
	}
	  
	private static int getRightChildIndex(int nodeIndex) {
		return 2 * nodeIndex + 2;
	}
	
	private static int getParentIndex(int nodeIndex) {
		
		return (nodeIndex - 1) / 2;
	}
	
	private static void printHeap() {
		
		System.out.println("Heap: " + data.toString());
	}
	
}
