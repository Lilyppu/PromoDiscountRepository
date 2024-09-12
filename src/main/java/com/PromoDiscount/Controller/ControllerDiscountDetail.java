package com.PromoDiscount.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PromoDiscount.Models.DiscountDetail;
import com.PromoDiscount.Models.DiscountMaster;
import com.PromoDiscount.Services.ServiceDiscountDetail;
import com.PromoDiscount.Services.ServiceDiscountMaster;

@RestController
public class ControllerDiscountDetail {
	@Autowired
	ServiceDiscountDetail servDisd;
	
	@GetMapping("/discount/getdiscdetailall")
	public List<DiscountDetail> getDiscDtlAll(){
		return servDisd.getDiscDtlAll();
	}
	
}
