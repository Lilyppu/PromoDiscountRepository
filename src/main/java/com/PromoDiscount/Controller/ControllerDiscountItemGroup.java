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
	public Optional<DiscountItemGroup> getItemGroupAll (String vcode, Integer vseq){
		return servDigr.getItemGroupCU(vcode, vseq);
	}
	
	@GetMapping("/discount/updateitemgroup")
	public String UpdateItemGroup (String p_code, Integer p_seq , String itgroup , 
			String status, String userid, String msg) {
		return servDigr.UpdateItemGroup(p_code, p_seq, itgroup, status, userid, msg);	
	}
	
	@GetMapping("/discount/getdiscitemgrouplist")
	public List<DiscountItemGroup> getItemGroupList (String vcode){
		return servDigr.getItemGroupList(vcode);
	}
	
	@PostMapping("/discount/savediscitemgroup")
	public String saveUpdateItemGroup (@RequestBody DiscountItemGroup ig) {
		return servDigr.saveUpdateItemGroup(ig);		
	}
}
