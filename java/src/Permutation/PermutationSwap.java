package Permutation;

import java.util.Arrays;

public class Permutation {

public static void main(String[] args) {
		
		int[] ns = {1, 2, 3, 4};
		permute(ns, 0, ns.length);
	}
	
	private static void swap(int[] v, int i, int j) {
		int t = v[i];
		v[i] = v[j];
		v[j] = t;
	}

	private static void permute(int[] v, int start, int n) {
		if (n == start) {
			System.out.println(Arrays.toString(v));
			
		} else {
			for (int i = start; i < n; i++) {
				swap(v, i, start);
				permute(v, start+1, n);
				swap(v, i, start);
			}
		}
	}

}
