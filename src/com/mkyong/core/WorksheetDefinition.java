package com.mkyong.core;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "worksheet")
public class WorksheetDefinition {

	String type;
	String workbookName;
	String sheetNumberInWorkbook;
	String firstRateColumnName;
	String rateStartRowNum;
	String rateEndRowNum;

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

	List<Key> keys = new ArrayList<Key>();

	public List<Key> getKeys() {
		return keys;
	}

	public void setKeys(List<Key> keys) {
		this.keys = keys;
	}

}