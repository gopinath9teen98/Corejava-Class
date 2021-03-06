package com.te.collection.arraycollabera;

public class Employee {
	public Employee(double eId, String eName, String address) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.address = address;
	}

	private double eId;
	private String eName;
	private String address;

	public static void main(String[] args) {

	}

	public double geteId() {
		return eId;
	}

	public void seteId(double eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", address=" + address + "]";
	}

}
