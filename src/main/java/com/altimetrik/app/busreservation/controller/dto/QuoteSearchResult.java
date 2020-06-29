package com.altimetrik.app.busreservation.controller.dto;

import java.io.Serializable;
import java.util.Date;

public class QuoteSearchResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String busNumber;
	private String operaterName;
	private Date deparcherTime;
	private Date arrivalTime;
	private String duration;
	private String price;
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getOperaterName() {
		return operaterName;
	}
	public void setOperaterName(String operaterName) {
		this.operaterName = operaterName;
	}
	public Date getDeparcherTime() {
		return deparcherTime;
	}
	public void setDeparcherTime(Date deparcherTime) {
		this.deparcherTime = deparcherTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
