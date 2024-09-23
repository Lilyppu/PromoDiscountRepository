package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.PromoDiscount.Models.DiscountMaster;

@Repository
public interface IDiscountMasterRepository extends JpaRepository<DiscountMaster,String>{
	
	public Optional<DiscountMaster> findByDismCode(String discode);

	
	public List<DiscountMaster> findByDismFor (String vfor);
}
