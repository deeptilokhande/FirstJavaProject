package com.deepti.serialization;

import java.io.Serializable;

public class SaveObject implements Serializable{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return String.valueOf(i+" Is value of I");
	}
	
	
}