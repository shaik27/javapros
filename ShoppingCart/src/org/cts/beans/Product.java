package org.cts.beans;

public class Product {
	private int pid;
	private String title;
	private String imageUrl;
	private String price;
	private String desc;
	public Product()
	{
		
	}
	public Product(int pid, String title, String imageUrl, String price,
			String desc) {
		super();
		this.pid = pid;
		this.title = title;
		this.imageUrl = imageUrl;
		this.price = price;
		this.desc = desc;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
