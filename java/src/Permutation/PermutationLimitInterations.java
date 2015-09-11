package Permutation;

import java.util.Arrays;

public class PermutationLimitInterations {
	
	public static void main(String[] args) {
		
		int[] ns = {1, 2, 3, 4, 5};
		permute(ns, 0, ns.length, 2);
	}
	
	private static void swap(int[] v, int i, int j) {
		int t = v[i];
		v[i] = v[j];
		v[j] = t;
	}

	private static void permute(int[] v, int depth, int n, int setNumber) {
		if (setNumber == depth) {
			System.out.println(Arrays.toString(v));
			
		} else {
			for (int i = depth; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					swap(v, i, j);
					permute(v, depth+1, n, setNumber);
					swap(v, i, j);
				}
			}
		}
	}

}
