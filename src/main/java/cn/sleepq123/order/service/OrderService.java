package cn.sleepq123.order.service;

import cn.sleepq123.order.pojo.Order;

public interface OrderService {
	public Order findByOrderId(int orderId);
}
