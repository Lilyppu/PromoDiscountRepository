package com.PromoDiscount.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PromoDiscount.Models.DiscountItemGroup;
import com.PromoDiscount.Services.ServiceDiscountItemGroup;


@RestController
public class ControllerDiscountItemGroup {
	@Autowired
	ServiceDiscountItemGroup servDigr;
	
	@GetMapping("/discount/getdiscitemgroup")
	public List<DiscountItemGroup> getItemGroupAll (String vcode, Integer vseq){
		return servDigr.getItemGroupAll(vcode, vseq);
	}
	
	@PostMapping("/discount/savediscitemgroup")
	public String saveUpdateItemGroup (@RequestBody DiscountItemGroup ig) {
		return servDigr.saveUpdateItemGroup(ig);		
	}
}
