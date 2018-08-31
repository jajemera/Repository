package com.telusko.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="alien_table")
public class Alien {
	
	@Id
	private int aid;
	
	// Transient annotation will not include field
	private AlienName aname;
	
	// diff table column name
	@Column(name="alien_color")
	private String color;
	
	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	/**
	 * @return the aname
	 */
	public AlienName getAname() {
		return aname;
	}
	/**
	 * @param aname the aname to set
	 */
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
}
