package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
@Id
private int addressId;
private String houseNumber;
private String area;
private String landmark;
private String streetName;
private String taluka;
private String city;
private String state;
private String country;
private String pincode;
private String district;
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getTaluka() {
	return taluka;
}
public void setTaluka(String taluka) {
	this.taluka = taluka;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}

}
