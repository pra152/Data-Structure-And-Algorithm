package com.bridgelabz.algorithm_programs.string_permutations;

public class IterativeMethod {
	static String arr1[];
	public void permutation(String str,int n) {
		
		char a[] = str.toCharArray();
		int p[] = new int[n];
		
		int i = 1;
		int count = 0;
		arr1[count] = str;
		count++;
		
		while(i < n) {
			if(p[i] < i) {
				int j = ((i%2) == 0) ? 0 : p[i];
				arr1[count] = swap(a,i,j);
				count++;
				p[i]++;
				i = 1;
			}
			else {
				p[i] = 0;
				i++;
			}
		}
	}


public String swap(char a[],int start, int end) {
	char temp = a[start];
	a[start] = a[end];
	a[end] = temp;
	return String.valueOf(a);
}

public static String[] iterative() {
	IterativeMethod iterativeMethod = new IterativeMethod();
	System.out.println("This is Iterative!!");
	String str = "ABC";
	int n = str.length();
	arr1 = new String[n * 2];
	iterativeMethod.permutation(str, n);
	for(String string : arr1) {
		System.out.print(string + " ");
	}
	System.out.println();
	return arr1;
	
}
}