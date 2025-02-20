package com.PromoDiscount.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.PromoDiscount.Models.DiscountDetail;
import com.PromoDiscount.Models.PromoDiscount;
import com.PromoDiscount.Repository.IPromoDiscountRepository;


@Service
public class ServicePromoDiscount {
	@Autowired
	IPromoDiscountRepository repoDisp;
	
	public List<PromoDiscount> getPromoDiscAll (String discode) {
		return repoDisp.findByDispCode(discode);
	}
	
	public Optional<PromoDiscount> getPromoDiscSingle (String discode, Integer seq) {
		return repoDisp.findByDispCodeAndDispSeqNo(discode, seq);
	}
	
	public String SavePromoDiscount(PromoDiscount pd) {
		System.out.println("aaaa");
		repoDisp.save(pd);
		return "Submit Successfully";		
	}
	
	

}
