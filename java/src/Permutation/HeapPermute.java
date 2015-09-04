package Permutation;

import java.util.Arrays;

public class HeapPermute {
	
	public static void main(String[] args) {
		
		int[] ns = {1, 2, 3, 4};
		permute(ns, ns.length);
	}
	
	private static void swap(int[] v, int i, int j) {
		int t = v[i];
		v[i] = v[j];
		v[j] = t;
	}

	private static void permute(int[] v, int n) {
		if (n == 1) {
			System.out.println(Arrays.toString(v));
			
		} else {
			for (int i = 0; i < n; i++) {
				permute(v, n-1);
				
				if (n % 2 == 1) {
					swap(v, 0, n-1);
				} else {
					swap(v, i, n-1);
				}
			}
		}
	}
	
}
