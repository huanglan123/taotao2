package com.cindy.common;

public class EchartsResult {//扇形图所需元素
	private String name;
	private Integer value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "EchartsResult [name=" + name + ", value=" + value + "]";
	}
}
