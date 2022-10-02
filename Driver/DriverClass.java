package com.greatlearning.Driver;

import com.greatlearning.Admin.Admin;
import com.greatlearning.Hr.Hr;
import com.greatlearning.Super.Super;
import com.greatlearning.Tech.Tech;

public class DriverClass{
	
	public static void main(String[] args) {
		
		Super superDept = new Super();
		Hr hrDept = new Hr();
		Tech techDept = new Tech();
		Admin adminDept = new Admin();
		superDept.displaySuper();
		System.out.println();
		adminDept.displayAdmin();
		System.out.println();
		hrDept.displayHr();
		System.out.println();
		techDept.displayTech();
	
	}	
	
}