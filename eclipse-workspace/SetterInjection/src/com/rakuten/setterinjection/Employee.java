package com.rakuten.setterinjection;

public class Employee {
private int id;
private String name;
private String desig;

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesig() {
	return desig;
}

public void setDesig(String desig) {
	this.desig = desig;
}

public void setId(int id) {
	this.id = id;
}

public void displayEmployee() {
	// TODO Auto-generated method stub

	System.out.println(this.id+" | "+this.name+" | "+this.desig);
}

}
