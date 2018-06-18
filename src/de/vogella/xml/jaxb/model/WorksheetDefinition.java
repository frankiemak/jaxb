package de.vogella.xml.jaxb.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement
public class WorksheetDefinition {

	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "settings")
	// XmlElement sets the name of the entities
	@XmlElement(name = "book")
	private ArrayList<Book> bookList;

	String type;
	String workbookName;
	String sheetNumberInWorkbook;
	String firstRateColumnName;
	String rateStartRowNum;
	String rateEndRowNum;

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public ArrayList<Book> getBooksList() {
		return bookList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWorkbookName() {
		return workbookName;
	}

	public void setWorkbookName(String workbookName) {
		this.workbookName = workbookName;
	}

	public String getSheetNumberInWorkbook() {
		return sheetNumberInWorkbook;
	}

	public void setSheetNumberInWorkbook(String sheetNumberInWorkbook) {
		this.sheetNumberInWorkbook = sheetNumberInWorkbook;
	}

	public String getFirstRateColumnName() {
		return firstRateColumnName;
	}

	public void setFirstRateColumnName(String firstRateColumnName) {
		this.firstRateColumnName = firstRateColumnName;
	}

	public String getRateStartRowNum() {
		return rateStartRowNum;
	}

	public void setRateStartRowNum(String rateStartRowNum) {
		this.rateStartRowNum = rateStartRowNum;
	}

	public String getRateEndRowNum() {
		return rateEndRowNum;
	}

	public void setRateEndRowNum(String rateEndRowNum) {
		this.rateEndRowNum = rateEndRowNum;
	}

	@Override
	public String toString() {
		return "WorksheetDefinition [bookList=" + bookList + ", type=" + type + ", workbookName=" + workbookName
				+ ", sheetNumberInWorkbook=" + sheetNumberInWorkbook + ", firstRateColumnName=" + firstRateColumnName
				+ ", rateStartRowNum=" + rateStartRowNum + ", rateEndRowNum=" + rateEndRowNum + "]";
	}

}