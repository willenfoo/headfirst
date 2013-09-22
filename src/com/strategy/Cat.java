package com.strategy;

public class Cat implements Comparable {
	
	public Cat(Integer age) {
		super();
		this.age = age;
	}

	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object obj) {
		Cat cat = (Cat)obj;
		if (cat.getAge() > this.age) {
			return 1;
		} else if (cat.getAge() < this.age) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
