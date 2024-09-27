package com.PromoDiscount.Services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PromoDiscount.Models.DiscountItem;
import com.PromoDiscount.Repository.IDiscountItemRepository;

@Service
public class ServiceDiscountItem {
	@Autowired
	IDiscountItemRepository repoDitem;
	
	public List<DiscountItem> getItemAll (String vcode, Integer vseq){
		return repoDitem.findByDitmCodeAndDitmSeq(vcode, vseq);
	}
	
	public String saveUpdateItem (DiscountItem it) {
		repoDitem.save(it);
		return "Submit Successfully";
	}
}
