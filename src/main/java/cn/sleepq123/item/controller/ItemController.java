package cn.sleepq123.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.sleepq123.item.pojo.Item;
import cn.sleepq123.item.service.ItemService;

@RestController
@RequestMapping(value="/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("{itemid}")
	public Item findById(@PathVariable(name="itemid") int itemId) {
		Item item = itemService.findById(itemId);
		return item;
	}
}
