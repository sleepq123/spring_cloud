package cn.sleepq123.order.pojo;

import java.util.List;

public class Order {
	private int orderId;
	private String createTime;
	private List<OrderDetil> orderDetils;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public List<OrderDetil> getOrderDetils() {
		return orderDetils;
	}
	public void setOrderDetils(List<OrderDetil> orderDetils) {
		this.orderDetils = orderDetils;
	}
	public Order(int orderId, String createTime, List<OrderDetil> orderDetils) {
		super();
		this.orderId = orderId;
		this.createTime = createTime;
		this.orderDetils = orderDetils;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", createTime=" + createTime + ", orderDetils=" + orderDetils + "]";
	}
	
	
	
}
