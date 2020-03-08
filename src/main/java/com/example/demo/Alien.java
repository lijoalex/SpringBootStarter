package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Alien {
	public Alien() {
		super();
		System.out.println("Alien Object Created");
	}
	private int aid;
	private String aname;
	private String tech;
	@Autowired //searches by type. default eg: laptop
//	@Qualifier("lap1") //searches by name, throws org.springframework.beans.factory.NoSuchBeanDefinitionException, if not found
	private Laptop laptop;

	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show() {
		System.out.println("In show");	
		laptop.compile();
	}
}
