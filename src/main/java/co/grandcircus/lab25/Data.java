package co.grandcircus.lab25;

import java.util.Arrays;

public class Data {

	private String[] text;
	private String[] temperature;
	
	

	public Data() {
		super();
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}
	

	public String[] getTemperature() {
		return temperature;
	}

	public void setTemperature(String[] temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Data [text=" + Arrays.toString(text) + ", temperature=" + Arrays.toString(temperature) + "]";
	}
	
	
	
}
