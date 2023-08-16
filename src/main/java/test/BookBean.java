package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BookBean implements Serializable
{
	private String code;
	private String bName;
	private String bAuther;
	private float bPrice;
	private int bQty;
	public BookBean() {}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuther() {
		return bAuther;
	}
	public void setbAuther(String bAuther) {
		this.bAuther = bAuther;
	}
	public float getbPrice() {
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	public int getbQty() {
		return bQty;
	}
	public void setbQty(int bQty) {
		this.bQty = bQty;
	}
	

}
