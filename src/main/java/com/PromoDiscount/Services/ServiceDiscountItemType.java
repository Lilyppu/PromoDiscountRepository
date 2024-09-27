package com.PromoDiscount.Services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PromoDiscount.Models.DiscountItemType;
import com.PromoDiscount.Repository.IDiscountItemTypeRepository;

@Service
public class ServiceDiscountItemType {
	@Autowired
	IDiscountItemTypeRepository repoDity;
	
	public List<DiscountItemType> getItemTypeAll (String vcode, Integer vseq){
		return repoDity.findByDityCodeAndDitySeq(vcode, vseq);
	}
	
	public String saveUpdateItemType (DiscountItemType it) {
		repoDity.save(it);
		return "Submit Successfully";
	}
}
