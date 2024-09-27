package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.PromoDiscount.Models.DiscountItemType;
import com.PromoDiscount.Models.DiscountItemTypeCompKey;

@Repository
public interface IDiscountItemTypeRepository  extends JpaRepository<DiscountItemType,DiscountItemTypeCompKey>{
	
	public List<DiscountItemType> findByDityCodeAndDitySeq(String vcode, Integer vseq);
		
	
}
