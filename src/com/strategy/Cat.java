package com.strategy;

public class Cat implements Comparable {
	
	public Cat(Integer age) {
		super();
		this.age = age;
	}

	private Integer age;

	private Comparator comparator = new CatAgeComparator();
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	public Comparator getComparator() {
		return comparator;
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	@Override
	public int compareTo(Object obj) {
		/*Cat cat = (Cat)obj;
		if (cat.getAge() > this.age) {
			return 1;
		} else if (cat.getAge() < this.age) {
			return -1;
		} else {
			return 0;
		}*/
		return comparator.compare(this, obj);
	}
	
}
