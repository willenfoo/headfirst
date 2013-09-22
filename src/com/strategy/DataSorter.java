package com.strategy;

public class DataSorter {

	public static void sort(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				Comparable comparable1 = (Comparable)array[i];
				Comparable comparable2 = (Comparable)array[j];
				if (comparable1.compareTo(comparable2) < 0) {
					Object temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
 
}
