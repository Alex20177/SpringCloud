package com.in28minutes.microservices.limitsservice.bean;

import lombok.Data;

@Data
public class LimitConfiguration {

	private int maximum;
	private int minimum;

	public LimitConfiguration() {}
	
	public LimitConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
}//Close LimitConfiguration class.
