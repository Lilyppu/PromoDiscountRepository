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
	
	public List<DiscountItemGroup> getItemGroupAll (String vcode, Integer vseq){
		return repoDigr.findByDigrCodeAndDigrSeq(vcode, vseq);
	}
	
	public String saveUpdateItemGroup (DiscountItemGroup ig) {
		repoDigr.save(ig);
		return "Submit Successfully";
	}
	
}
