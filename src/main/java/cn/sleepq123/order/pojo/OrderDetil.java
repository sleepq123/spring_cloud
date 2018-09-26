package cn.sleepq123.order.pojo;

public class OrderDetil {
	private int orderId;
	private Item item;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public OrderDetil(int orderId, Item item) {
		super();
		this.orderId = orderId;
		this.item = item;
	}
	public OrderDetil() {
		super();
	}
	@Override
	public String toString() {
		return "OrderDetil [orderId=" + orderId + ", item=" + item + "]";
	}
	
	
	
	
}
