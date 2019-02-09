package com.uetty.dbo.api.entity;

import java.io.Serializable;

public class Config implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	String name;
	String propValue;
	String note;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setValue(String propValue) {
		this.propValue = propValue;
	}
	public int getIntValue(int defaultValue) {
		int value = propValue != null && !"".equals(propValue.trim()) ? Integer.parseInt(propValue) : defaultValue;
		return value;
	}
	public long getIntValue(long defaultValue) {
		long value = propValue != null && !"".equals(propValue.trim()) ? Long.parseLong(propValue) : defaultValue;
		return value;
	}
	public String getStringValue() {
		return this.propValue;
	}
	public double getDoubleValue(double defaultValue) {
		double value = propValue != null && !"".equals(propValue.trim()) ? Double.parseDouble(propValue) : defaultValue;
		return value;
	}
	public String getPropValue() {
		return propValue;
	}
	public void setPropValue(String propValue) {
		this.propValue = propValue;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
