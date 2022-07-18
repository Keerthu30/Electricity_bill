package com.capgemini.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reading {

	@Id
	private long readingid;
	private int unitsconsumed;
	private Date readingdate;
	private int priceperunits;

	public long getReadingid() {
		return readingid;
	}

	public void setReadingid(long readingid) {
		this.readingid = readingid;
	}

	public int getUnitsconsumed() {
		return unitsconsumed;
	}

	public void setUnitsconsumed(int unitsconsumed) {
		this.unitsconsumed = unitsconsumed;
	}

	public Date getReadingdate() {
		return readingdate;
	}

	public void setReadingdate(Date readingdate) {
		this.readingdate = readingdate;
	}

	public int getPriceperunits() {
		return priceperunits;
	}

	public void setPriceperunits(int priceperunits) {
		this.priceperunits = priceperunits;
	}

}
