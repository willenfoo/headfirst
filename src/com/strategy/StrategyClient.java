package com.strategy;

public class StrategyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] array = new Integer[]{12, 21, 22, 34, 1, 3};
		Cat[] cats = {new Cat(21),new Cat(20),new Cat(16)};
		DataSorter.sort(cats);
		
		/*for (Integer integer : array) {
			System.out.println(integer);
		}*/
		
		for (Cat cat : cats) {
			System.out.println(cat.getAge());
		}
	}

}
