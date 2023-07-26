package com.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getId()>e2.getId())
		{
			return -1; 
		
		}
	   
		
	    
		
		
		return 0;
	}
	
	

}
