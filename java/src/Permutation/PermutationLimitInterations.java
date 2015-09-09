package Permutation;

import java.util.Arrays;

public class PermutationLimitInterations {

public static void main(String[] args) {
		
		int[] ns = {1, 2, 3, 4};
		int interationsLimit = 1;		
		
		permute(ns, 0, ns.length, interationsLimit);
	}
	
	private static void swap(int[] v, int i, int j) {
		int t = v[i];
		v[i] = v[j];
		v[j] = t;
	}

	private static void permute(int[] v, int depth, int n, int interationsLimit) {
		if (n == depth ) {
			System.out.println(Arrays.toString(v));
			
		} else {
			
			for (int i = depth; i < n; i++) {
				System.out.println("- \t" + Arrays.toString(v) + " i: " + i + " depth: " + depth);
				// swap
				swap(v, i, depth);
				System.out.println("-- \t" + Arrays.toString(v) + " i: " + i + " depth: " + depth);
				
				permute(v, depth+1, n, interationsLimit--);
				
				// undo
				swap(v, i, depth);
			}
		}
	}	
}
