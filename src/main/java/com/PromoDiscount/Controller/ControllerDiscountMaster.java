package com.PromoDiscount.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PromoDiscount.Models.DiscountMaster;
import com.PromoDiscount.Services.ServiceDiscountMaster;

@RestController
public class ControllerDiscountMaster {
	@Autowired
	ServiceDiscountMaster servDisM;
	
	@GetMapping("/discount/getdiscmasterall")
	public List<DiscountMaster> getDiscMasterList(){
		return servDisM.getDiscMasterList();
	}
	
	@GetMapping("/discount/getdiscmastersingle")
	public Optional<DiscountMaster> getDiscMasterSingle(String pcode){
		return servDisM.getDiscMasterSingle(pcode);
	}
	
	@PostMapping("/discount/savediscmaster")
	public String saveUpdateDiscMaster(@RequestBody DiscountMaster discmaster) {
		return servDisM.saveUpdateDiscMaster(discmaster);
		
	}

}
