package com.PromoDiscount.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PromoDiscount.Models.DiscountDetail;
import com.PromoDiscount.Models.PromoDiscount;
import com.PromoDiscount.Services.ServicePromoDiscount;



@RestController
public class ControllerPromoDiscount {
	@Autowired
	ServicePromoDiscount servDisp;
	
	@GetMapping("/discount/getpromodiscAll")
	public List<PromoDiscount> getPromoDiscAll (String discode) {
		return servDisp.getPromoDiscAll(discode);
	}
	
	@GetMapping("/discount/getpromodiscsingle")
	public Optional<PromoDiscount> getPromoDiscSingle (String discode, Integer seq) {
		return servDisp.getPromoDiscSingle(discode, seq);
	}
	
	
	@PostMapping("/discount/savepromodiscount")
	public String SaveDiscountDetail(@RequestBody PromoDiscount ddt) {
		return servDisp.SavePromoDiscount(ddt);
	}
}
