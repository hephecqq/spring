package com.hephec.spring;

import java.util.Properties;

public class DataSource {

	private Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "DataSource [prop=" + prop + "]";
	}
}
