package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.PromoDiscount.Models.PromoDiscount;
import com.PromoDiscount.Models.PromoDiscountCompKey;

@Repository
public interface IPromoDiscountRepository extends JpaRepository<PromoDiscount, PromoDiscountCompKey>{
	public List<PromoDiscount> findByDispCode (String code);
	
	public Optional<PromoDiscount> findByDispCodeAndDispSeqNo (String code, Integer seq);
	
	
}
