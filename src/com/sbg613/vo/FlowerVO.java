package com.sbg613.vo;

import java.io.Serializable;

/**
 * 
 * 
 */



public class FlowerVO implements Serializable {

	private static final long serialVersionUID = -8556719521581435247L;
	
	private int seq;
    private String flowerName;
    private String flowerCode;
    
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getFlowerCode() {
		return flowerCode;
	}
	public void setFlowerCode(String flowerCode) {
		this.flowerCode = flowerCode;
	}


}
