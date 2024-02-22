package com.example.demo.auth;

import java.util.Objects;

public class AddressModel {
	private int userID;
	
	private String plotNo;
	
	private String street;
	
	private String city;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, plotNo, street, userID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressModel other = (AddressModel) obj;
		return Objects.equals(city, other.city) && Objects.equals(plotNo, other.plotNo)
				&& Objects.equals(street, other.street) && userID == other.userID;
	}
	
	
}
