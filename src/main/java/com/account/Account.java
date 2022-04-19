package com.account;

import java.util.List;

public class Account {
private int accno;
private double bal;
//public List<AccountDetails> getAccDetails() {
//	return accDetails;
//}
//public void setAccDetails(List<AccountDetails> accDetails) {
//	this.accDetails = accDetails;
//}
private String atype;
//private List<AccountDetails> accDetails;
	public Account() {
		// TODO Auto-generated constructor stub
	}
public Account(int accno, double bal, String atype) {
	super();
	this.accno = accno;
	this.bal = bal;
	this.atype = atype;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public String getAtype() {
	return atype;
}
public void setAtype(String atype) {
	this.atype = atype;
}

}
