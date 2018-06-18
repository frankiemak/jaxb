package com.mkyong.core;

import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {
	public static void main(String args[]) throws Exception {
		WorksheetDefinition worksheetDefinition = new WorksheetDefinition();
		worksheetDefinition.setType("premiumRate");

		JAXBContext context = JAXBContext.newInstance(com.mkyong.core.WorksheetDefinition.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(context, new FileWriter("test.xml"));
	}
}