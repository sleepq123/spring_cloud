package cn.sleepq123.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cn.sleepq123.order.pojo.Item;
import cn.sleepq123.order.pojo.Order;
import cn.sleepq123.order.pojo.OrderDetil;
import cn.sleepq123.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	final static String ITEM_MICSERVER = "sqshop-micserver-item";
	static List<Order> orders = new ArrayList<Order>();
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	DiscoveryClient discoveryClient;
	
	//准备测试数据
	static {
	
		for(int i = 0; i <3; i++) {
			List<OrderDetil>  orderDetils = new ArrayList<>();
			orderDetils.add(new OrderDetil(2000+i,new Item(1)));
			orderDetils.add(new OrderDetil(2000+i,new Item(2)));
			
			Order order = new Order(2000+i,"2018-09-28-0"+i,orderDetils);
			orders.add(order);
		}
	}
	

	
	@Override 
	public Order findByOrderId(int orderId) {
		List<ServiceInstance> sInstances = discoveryClient.getInstances(ITEM_MICSERVER);
		
		if(sInstances == null && sInstances.equals(null)) {
			return null;
		}
		
		ServiceInstance serviceInstance = sInstances.get(0);
		String url ="http://" +  serviceInstance.getHost()  + ":" + serviceInstance.getPort();
		System.out.println("url為：" + url);
		
		Order relOrder = null;
		for (Order order : orders) {
			if(order.getOrderId() == orderId) {
				relOrder = order;
			}
		}
		
		List<OrderDetil> relOrderDetils = relOrder.getOrderDetils();
		
		for(OrderDetil orderDetil:relOrderDetils) {
			Item item = restTemplate.getForObject(url+"/item/" +orderDetil.getItem().getItemId(), Item.class);
			orderDetil.setItem(item);
		}
		
		return relOrder;
	}

}
