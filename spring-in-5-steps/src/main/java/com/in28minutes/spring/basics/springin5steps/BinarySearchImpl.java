package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting an array
		int[] sortedNumbers =sortAlgorithm.sort(numbers);
		
		// Search the array
		// Return the result
		return 3;
	}

	
	
}
