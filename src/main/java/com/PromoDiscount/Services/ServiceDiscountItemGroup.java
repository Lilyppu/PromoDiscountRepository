package com.PromoDiscount.Services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PromoDiscount.Models.DiscountItemGroup;
import com.PromoDiscount.Repository.IDiscountItemGroupRepository;



@Service
public class ServiceDiscountItemGroup {
	@Autowired
	IDiscountItemGroupRepository repoDigr;
	
	public Optional<DiscountItemGroup> getItemGroupCU (String vcode, Integer vseq){
		return repoDigr.findByDigrCodeAndDigrSeq(vcode, vseq);
	}
	
	
	
	public List<DiscountItemGroup> getItemGroupList (String vcode){
		return repoDigr.findByDigrCode(vcode);
	}
	
	public String saveUpdateItemGroup (DiscountItemGroup ig) {
		repoDigr.save(ig);
		return "Submit Successfully";
	}
	
	public String UpdateItemGroup (String p_code, Integer p_seq , String itgroup , 
			String status, String userid, String msg) {
		return repoDigr.runUpdateItemGroup(p_code, p_seq, itgroup, status, userid, msg);
	
	}
	
}
