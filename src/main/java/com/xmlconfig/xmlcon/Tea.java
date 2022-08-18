package com.xmlconfig.xmlcon;

/**
 * Hello world!
 *
 */
public class Tea 
{
    private double price;
    
    public double getprice() {
    	return price;
    }
    public void setPrice(double price) {
    	this.price = price;
    }
	public Tea() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tea [price=" + price + "]";
	}
    
    
}
