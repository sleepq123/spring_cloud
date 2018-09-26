package cn.sleepq123.item.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.sleepq123.item.pojo.Item;
import cn.sleepq123.item.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	static List<Item> items = new ArrayList<Item>();
	
	
	//准备测试数据
	static {
		for(int i = 0;i < 3; i++) {
			Item item = new Item(i,"item name" + i,i*100);
			items.add(item);
		}
	}
	@Override
	public Item findById(int itemId) {
	
		for(Item item:items) {
			if(item.getItemId() == itemId) {
				return item;
			}
		}
		return null;
	}

}
