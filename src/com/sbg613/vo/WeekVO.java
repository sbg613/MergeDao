package com.sbg613.vo;

import java.io.Serializable;

/**
 * 
 * 
 */


public class WeekVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2852010983875573659L;
	
	private int seq;
    private String weekName;
    private String weekCode;
    
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWeekName() {
		return weekName;
	}
	public void setWeekName(String weekName) {
		this.weekName = weekName;
	}
	public String getWeekCode() {
		return weekCode;
	}
	public void setWeekCode(String weekCode) {
		this.weekCode = weekCode;
	}
    


}
