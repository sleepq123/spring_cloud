package cn.sleepq123.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.sleepq123.order.pojo.Order;
import cn.sleepq123.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired 
	OrderService orderService;
	
	@GetMapping("{orderId}")
	public Order getOrderByOrderId(@PathVariable(name="orderId") int orderId) {
		return orderService.findByOrderId(orderId);
	}
}
