package com.altimetrik.app.busreservation.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "BusDetails")
@Table(name = "BUS_DETAILS")
public class BusDetails implements Serializable, Comparable<BusDetails> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "BUS_NUMBER")
	private Long busNumber;
	
	@Column(name = "OPERATER_NAME")
	private String operaterName;
	
	@Column(name = "SOURCE_CITY")
	private String sourceCity;
	
	@Column(name = "DESTINATION_CITY")
	private String destinationCity;
	
	@Column(name = "DEPARCHER_TIME")
	private Date deparcherTime;
	
	@Column(name = "ARRIVAL_TIME")
	private Date arrivalTime;
	
	@Column(name = "PRICE")
	private Double price;

	public Long getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(Long busNumber) {
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((busNumber == null) ? 0 : busNumber.hashCode());
		result = prime * result + ((deparcherTime == null) ? 0 : deparcherTime.hashCode());
		result = prime * result + ((destinationCity == null) ? 0 : destinationCity.hashCode());
		result = prime * result + ((operaterName == null) ? 0 : operaterName.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((sourceCity == null) ? 0 : sourceCity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusDetails other = (BusDetails) obj;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (busNumber == null) {
			if (other.busNumber != null)
				return false;
		} else if (!busNumber.equals(other.busNumber))
			return false;
		if (deparcherTime == null) {
			if (other.deparcherTime != null)
				return false;
		} else if (!deparcherTime.equals(other.deparcherTime))
			return false;
		if (destinationCity == null) {
			if (other.destinationCity != null)
				return false;
		} else if (!destinationCity.equals(other.destinationCity))
			return false;
		if (operaterName == null) {
			if (other.operaterName != null)
				return false;
		} else if (!operaterName.equals(other.operaterName))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (sourceCity == null) {
			if (other.sourceCity != null)
				return false;
		} else if (!sourceCity.equals(other.sourceCity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusDetails [busNumber=" + busNumber + ", operaterName=" + operaterName + ", sourceCity=" + sourceCity
				+ ", destinationCity=" + destinationCity + ", deparcherTime=" + deparcherTime + ", arrivalTime="
				+ arrivalTime + ", price=" + price + "]";
	}

	@Override
	public int compareTo(BusDetails busDetails) {
		return this.price.compareTo(busDetails.price);
	}

}
