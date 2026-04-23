package com.vibol.corepattern.templatemethod04;

public class CSVDataRender extends DataRender {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		return "Processed " + data;
	}

}
