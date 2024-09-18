package com.PromoDiscount.Controller;

import java.math.BigDecimal;
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
	public List<DiscountDetail> getDiscDtlAll(String pcode){
		return servDisd.getDiscDtlAll(pcode);
	}
	
	@GetMapping("/discount/getdiscdetailSingle")
	public Optional<DiscountDetail> getDiscDtlSingle(String code, Integer seq) {		
		return servDisd.getDiscDtlSingle(code, seq);
	}
	
	@PostMapping("/discount/savediscountdtl")
	public String SaveDiscountDetail(@RequestBody DiscountDetail ddt) {
		return servDisd.SaveDiscountDetail(ddt)	;
	}
	
	@PostMapping("/discount/updatedisdtl")
	public String runUpdateJournal(String p_code, String p_seq, 
			String sodisbeg , String sodisend , BigDecimal sodisamount, BigDecimal sodispct , 
			String status, String userid , String p_msg) {
		
		return servDisd.runUpdDiscDtl(p_code, p_seq, sodisbeg, sodisend, sodisamount, sodispct, status, userid, p_msg);
	}
	
	
}
