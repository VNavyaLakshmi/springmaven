package com.rakuten.setterinjection;

import java.util.Iterator;
import java.util.List;

public class BookMap {
	
	private int deptId;
	private String deptName;
	private List<String> fnames;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<String> getFnames() {
		return fnames;
	}
	public void setFnames(List<String> fnames) {
		this.fnames = fnames;
	}
	
	public void displaybook() {
		System.out.println("Dept Id\tDept Name");
		System.out.println(this.deptId+"\t"+this.deptName);
		System.out.println("\t\t\tFaculty Name");
		
		Iterator<String>itr = fnames.iterator();
		while(itr.hasNext()) {
			System.out.println("\t\t\t"+itr.next());
		}
	}

}