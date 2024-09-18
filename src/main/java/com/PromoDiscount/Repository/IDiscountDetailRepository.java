package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.PromoDiscount.Models.DiscountDetail;
import com.PromoDiscount.Models.DiscountDetailCompKey;
import com.PromoDiscount.Models.DiscountMaster;

@Repository

public interface IDiscountDetailRepository  extends JpaRepository<DiscountDetail, DiscountDetailCompKey> {

	public List<DiscountDetail> findByDisdCode(String code);
	
 public Optional<DiscountDetail> findByDisdCodeAndDisdSeqNo(String code, Integer seq);
 
 @Procedure(procedureName = "p_update_discdetail")
	public String runUpdateDiscDtl(String p_code, String p_seq, 
			String sodisbeg , String sodisend , BigDecimal sodisamount, BigDecimal sodispct , 
			String status, String userid , String p_msg);
}
