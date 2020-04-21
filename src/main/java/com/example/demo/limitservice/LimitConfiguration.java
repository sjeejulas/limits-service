package com.example.demo.limitservice;

public class LimitConfiguration {

	private int minimum;
	private int maximum;

	public LimitConfiguration(int i, int j) {
		this.minimum = i;
		this.maximum = j;

	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
