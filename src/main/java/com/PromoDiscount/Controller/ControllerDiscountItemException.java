package com.PromoDiscount.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PromoDiscount.Models.DiscountItemException;
import com.PromoDiscount.Services.ServiceDiscountItemException;


@RestController
public class ControllerDiscountItemException {
	@Autowired
	ServiceDiscountItemException servItemx;
	
	@GetMapping("/discount/getdiscitemexc")
	public List<DiscountItemException> getItemGroupAll (String vcode, Integer vseq){
		return servItemx.getItemExcAll(vcode, vseq);
	}
	
	@PostMapping("/discount/savediscitemexc")
	public String saveUpdateItemGroup (@RequestBody DiscountItemException it) {
		return servItemx.saveUpdateItemExc(it);
	}
	
	
}
