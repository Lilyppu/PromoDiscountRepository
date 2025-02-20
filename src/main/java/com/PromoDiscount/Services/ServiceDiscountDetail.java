package com.PromoDiscount.Services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PromoDiscount.Models.DiscountDetail;
import com.PromoDiscount.Models.DiscountMaster;
import com.PromoDiscount.Repository.IDiscountDetailRepository;
import com.PromoDiscount.Repository.IDiscountMasterRepository;

@Service
public class ServiceDiscountDetail {
	@Autowired
	IDiscountDetailRepository reporDisd;
	
	public List<DiscountDetail> getDiscDtlAll(String pcode){
		return reporDisd.findByDisdCode(pcode);
	}
	
	public Optional<DiscountDetail> getDiscDtlSingle(String code, Integer seq) {		
		return reporDisd.findByDisdCodeAndDisdSeqNo(code, seq);		
	}
	
	public String SaveDiscountDetail(DiscountDetail ddt) {
		reporDisd.save(ddt);
		return "Submit Successfully";		
	}
	
	public String runUpdDiscDtl(String p_code, String p_seq, 
			String sodisbeg , String sodisend , BigDecimal sodisamount, BigDecimal sodispct , 
			String status, String userid , String p_msg) {
		
		return reporDisd.runUpdateDiscDtl(p_code, p_seq, sodisbeg, sodisend, sodisamount, sodispct, status, userid, p_msg);
	}
	
	
	
}
