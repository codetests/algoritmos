package BinaryTree;

import java.util.Arrays;

public class HeapMin_02Inserting {

    private static Integer[] data; // <- Tree representation
    private static Integer heapSize = 0;
	
	public static void main(String[] args) {
		
		data = new Integer[100];
		
		insert(1);
		insert(3);
		insert(6);
		insert(5);
		insert(9);
		insert(8);
		
		printHeap();
		insert(4);
		printHeap();

	}
	
	public static boolean insert(int value) {
		System.out.println("inserting");
		
		if (heapSize == data.length) {
			return false;
		} else {
              heapSize++;
              data[heapSize - 1] = value;
              siftUp(heapSize - 1);
        }
        
        return true;
	}
	
	private static void siftUp(int nodeIndex) {
		
		System.out.println("siftUp");
		
		int parentIndex, tmp;

        if (nodeIndex != 0) {

        	parentIndex = getParentIndex(nodeIndex);

            if (data[parentIndex] > data[nodeIndex]) {
            	
            	tmp = data[parentIndex];
                data[parentIndex] = data[nodeIndex];
                data[nodeIndex] = tmp;
                siftUp(parentIndex);

            }
        }
	}
	
	private static int getParentIndex(int nodeIndex) {
		
		int r = (nodeIndex - 1) / 2;		
		return (r == 0) ? 1 : r;
	}
	
	private static void printHeap() {
		
		System.out.println("Heap: " + Arrays.toString(data));
	}
}
