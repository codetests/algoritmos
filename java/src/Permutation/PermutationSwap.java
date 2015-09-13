package Permutation;

import java.util.Arrays;

public class PermutationSwap {

public static void main(String[] args) {
		
		int[] ns = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		permute(ns, 0, ns.length);
	}
	
	private static void swap(int[] v, int i, int j) {
		
		if (i == j) return;
		
		int t = v[i];
		v[i] = v[j];
		v[j] = t;
	}

	private static void permute(int[] v, int depth, int n) {
		if (n == depth) {
//			System.out.println(Arrays.toString(v));
			
		} else {
			for (int i = depth; i < n; i++) {
				swap(v, i, depth); // System.out.println("\t1) i: " + i + " depth: " + depth + " n: " + n);
				permute(v, depth+1, n);
				swap(v, i, depth); // System.out.println("\t2) i: " + i + " depth: " + depth + " n: " + n);
			}
		}
	}

}
