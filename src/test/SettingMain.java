package test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import de.vogella.xml.jaxb.model.Book;
import de.vogella.xml.jaxb.model.WorksheetDefinition;

public class SettingMain {

	private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";

	public static void main(String[] args) throws JAXBException, IOException {

		ArrayList<Book> bookList = new ArrayList<Book>();

		// create settings
		WorksheetDefinition worksheetDefinition = new WorksheetDefinition();
		worksheetDefinition.setType("premiumRate");
		worksheetDefinition.setWorkbookName("rateTable_DTT_v1.xlsx");
		worksheetDefinition.setSheetNumberInWorkbook("0");
		worksheetDefinition.setFirstRateColumnName("7");
		worksheetDefinition.setRateStartRowNum("4");

		// create bookstore, assigning book
		// bookstore.setBookList(bookList);

		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(WorksheetDefinition.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		m.marshal(worksheetDefinition, System.out);

		// Write to File
		m.marshal(worksheetDefinition, new File(BOOKSTORE_XML));

		// get variables from our xml file, created before
		System.out.println();
		System.out.println("Output from our XML File: ");
		Unmarshaller um = context.createUnmarshaller();
		WorksheetDefinition bookstore2 = (WorksheetDefinition) um.unmarshal(new FileReader(BOOKSTORE_XML));
		System.out.println(bookstore2);

		// ArrayList<Book> list = bookstore2.getBooksList();
		// for (Book book : list) {
		// System.out.println("Book: " + book.getName() + " from " +
		// book.getAuthor());
		// }
	}
}