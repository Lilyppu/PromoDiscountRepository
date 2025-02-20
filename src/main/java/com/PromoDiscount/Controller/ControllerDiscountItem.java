package com.PromoDiscount.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PromoDiscount.Models.DiscountItem;
import com.PromoDiscount.Services.ServiceDiscountItem;


@RestController
public class ControllerDiscountItem {
	@Autowired
	ServiceDiscountItem servItem;
	
	@GetMapping("/discount/getdiscitem")
	public List<DiscountItem> getItemGroupAll (String vcode, Integer vseq){
		return servItem.getItemAll(vcode, vseq);
	}
	
	@PostMapping("/discount/savediscitem")
	public String saveUpdateItemGroup (@RequestBody DiscountItem it) {
		return servItem.saveUpdateItem(it);
	}
}
