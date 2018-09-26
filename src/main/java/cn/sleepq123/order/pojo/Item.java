package cn.sleepq123.order.pojo;

public class Item {
	private int itemId;
	private String itemName;
	private int money;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Item(int itemId, String itemName, int money) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.money = money;
	}
	public Item() {
		super();
	}
	public Item(int itemId) {
		super();
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", money=" + money + "]";
	}
	
	
}
