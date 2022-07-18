package com.capgemini.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Connection {

	@Id
	private long connectionid;
	private long connectionnum;
	private Date applicationdate;
	private Date connectiondate;

	public long getConnectionid() {
		return connectionid;
	}

	public void setConnectionid(long connectionid) {
		this.connectionid = connectionid;
	}

	public long getConnectionnum() {
		return connectionnum;
	}

	public void setConnectionnum(long connectionnum) {
		this.connectionnum = connectionnum;
	}

	public Date getApplicationdate() {
		return applicationdate;
	}

	public void setApplicationdate(Date applicationdate) {
		this.applicationdate = applicationdate;
	}

	public Date getConnectiondate() {
		return connectiondate;
	}

	public void setConnectiondate(Date connectiondate) {
		this.connectiondate = connectiondate;
	}

}
