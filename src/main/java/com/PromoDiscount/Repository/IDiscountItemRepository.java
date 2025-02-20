package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.PromoDiscount.Models.DiscountItem;
import com.PromoDiscount.Models.DiscountItemCompKey;

@Repository
public interface IDiscountItemRepository extends JpaRepository<DiscountItem, DiscountItemCompKey> {
	
	public List<DiscountItem> findByDitmCodeAndDitmSeq(String vcode, Integer vseq);
}
