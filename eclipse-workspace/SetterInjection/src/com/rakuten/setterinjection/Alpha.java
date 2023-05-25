package com.rakuten.setterinjection;

public class Alpha {
Beta b;
public Alpha() {
	 System.out.println("You have created an object of alpha");

}

public Beta getBeta() {
	return b;
}

public void setBeta(Beta b) {
	this.b = b;
}
 void print() {
	 System.out.println("Hello alpha");

 }
 void displayDetails() {
	 print();
	 b.print();
 }
}

