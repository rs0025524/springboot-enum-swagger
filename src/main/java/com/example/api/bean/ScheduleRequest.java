package com.example.api.bean;

public class ScheduleRequest {
	
	private String day;
	private String task;
	
	public ScheduleRequest() {
		super();
	}
	public ScheduleRequest(String day, String task) {
		super();
		this.day = day;
		this.task = task;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	

}
