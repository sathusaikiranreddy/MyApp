package com.example.demo.auth;

import java.util.List;
import java.util.Objects;

public class UserModel {

 	private String firstName;
 	
 	private String lastName;
 	
 	private String userName;
     
    private String email;
     
    private String password;
    
    private List<AddressModel> addressList;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AddressModel> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressModel> addressList) {
		this.addressList = addressList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressList, email, firstName, lastName, password, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return Objects.equals(addressList, other.addressList) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "UserModel [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", email="
				+ email + ", password=" + password + ", addressList=" + addressList + "]";
	}
    
    

}
