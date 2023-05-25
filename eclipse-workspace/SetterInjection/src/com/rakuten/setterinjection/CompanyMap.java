package com.rakuten.setterinjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CompanyMap {
   private Map<String, String>map;

public Map<String, String> getMap() {
	return map;
}

public void setMap(Map<String, String> map) {
	this.map = map;
}
   public void display() {
	   Iterator<Entry<String, String>>itr=map.entrySet().iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e=itr.next();
			System.out.println("Number:"+e.getKey()+" "+"Name"+e.getValue());
		}
	}
	
   }

