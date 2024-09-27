package com.PromoDiscount.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.PromoDiscount.Models.DiscountItemType;
import com.PromoDiscount.Services.ServiceDiscountItemType;


@RestController
public class ControllerDiscountItemType {
	@Autowired
	ServiceDiscountItemType servDity;
	
	@GetMapping("/discount/getdiscitemtype")
	public List<DiscountItemType> getItemGroupAll (String vcode, Integer vseq){
		return servDity.getItemTypeAll(vcode, vseq);
	}
	
	@PostMapping("/discount/savediscitemtype")
	public String saveUpdateItemGroup (@RequestBody DiscountItemType ig) {
		return servDity.saveUpdateItemType(ig);		
	}
	
}
