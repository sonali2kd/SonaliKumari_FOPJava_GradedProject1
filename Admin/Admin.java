package com.greatlearning.Admin;

import com.greatlearning.Super.Super;

public class Admin extends Super{
	
	public String departmentName(){
		this.departmentName = "Welcome to Admin Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		getTodaysWork = "Complete your documents Submission";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
	
	public void displayAdmin() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	
}