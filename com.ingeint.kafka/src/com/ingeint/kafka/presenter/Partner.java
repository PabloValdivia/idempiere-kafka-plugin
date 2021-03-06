package com.ingeint.kafka.presenter;

public class Partner {
	String uu;
	String name;
	String value;

	public String getUu() {
		return uu;
	}

	public void setUu(String uu) {
		this.uu = uu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Partner [uu=%s, name=%s, value=%s]", uu, name, value);
	}

}
