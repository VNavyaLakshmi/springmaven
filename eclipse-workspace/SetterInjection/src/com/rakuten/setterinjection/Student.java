package com.rakuten.setterinjection;



public class Student {
	
		private int id;
		private String name;
		private Address addr;

		
		
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public Address getAddr() {
			return addr;
		}



		public void setAddr(Address addr) {
			this.addr = addr;
		}



		public void diplayStudent() {
			// TODO Auto-generated method stub
			System.out.println("ID\tName\tCity\tState\tCountry");
			System.out.println(this.id+"\t"+this.name+"\t"+this.addr.city+"\t"+this.addr.state+"\t"+this.addr.country);
		}
		}
			 

