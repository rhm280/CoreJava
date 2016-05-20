package net.mv;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public int solution(int[] A) {
				
		int size, i = 0, k = 0;
		size = A.length;
		for (int j = 0; j < size; j++) {
			k = A[i];
			if (k >= 0 && k < size) {
				if (A[k] == -1) {
					return i;
				}
				i = k;
			} else {
				return 0;
			}
		}
		return i;
	
		List<Integer> intList = new ArrayList<Integer>();
	    for (int index = 0; index < A.length; index++)
	    {
	        intList.add(A[index]);
	    }
	    
		return 0;

				
				
				
	}

	public static void main(String[] args) {

		int[] test = { 1,4,-1,3,2 };
		System.out.println(solution(test));
	}
}