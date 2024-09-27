package com.PromoDiscount.Services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PromoDiscount.Models.DiscountItemException;
import com.PromoDiscount.Repository.IDiscountItemExceptionRepository;

@Service
public class ServiceDiscountItemException {
	@Autowired
	IDiscountItemExceptionRepository repoDitx;
	
	public List<DiscountItemException> getItemExcAll (String vcode, Integer vseq){
		return repoDitx.findByDitxCodeAndDitxSeq(vcode, vseq);
	}
	
	public String saveUpdateItemExc (DiscountItemException it) {
		repoDitx.save(it);
		return "Submit Successfully";
	}
}
