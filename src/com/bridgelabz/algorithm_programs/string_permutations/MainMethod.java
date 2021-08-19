package com.bridgelabz.algorithm_programs.string_permutations;

import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {
		String arr1[] = IterativeMethod.iterative();
		Arrays.sort(arr1);
		System.out.println("After sorting");
		for(String string : arr1) {
			System.out.print(string+" ");
		}
		System.out.println();
		String arr2[] = RecursionMethod.recursion();
		Arrays.sort(arr2);
		System.out.println("After sorting");
		for(String string : arr2) {
			System.out.print(string+" ");
		}
		System.out.println();
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are not Equal");
		}
	}

}
