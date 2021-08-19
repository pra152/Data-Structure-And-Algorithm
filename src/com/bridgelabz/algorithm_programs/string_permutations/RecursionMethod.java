package com.bridgelabz.algorithm_programs.string_permutations;

public class RecursionMethod {
	static String arr2[];
	Integer count = 0;
	public void permutation(String str, int start, int end) {
		if(start == end) {
			arr2[count] = str;
			count ++;
		}
		else {
			for(int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permutation(str, start+1, end);
				str = swap(str, start, i);
			}
		}
	}
	public String swap(String str, int start, int end) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[start];
		charArray[start] = charArray[end];
		charArray[end] = temp;
		return String.valueOf(charArray);
	}
	public static String[] recursion() {
		RecursionMethod recursionMethod = new RecursionMethod();
		System.out.println("This is Recursive!!");
		String str = "ABC";
		int n = str.length();
		arr2 = new String[n * 2];
		recursionMethod.permutation(str, 0, n-1);
		for(String string : arr2) {
			System.out.print(string+" ");
		}
		System.out.println();
		return arr2;
	}
}
