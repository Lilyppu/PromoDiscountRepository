package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


import com.PromoDiscount.Models.DiscountItemExcCompKey;
import com.PromoDiscount.Models.DiscountItemException;

@Repository
public interface IDiscountItemExceptionRepository extends JpaRepository<DiscountItemException,DiscountItemExcCompKey> {

	public List<DiscountItemException> findByDitxCodeAndDitxSeq(String vcode, Integer vseq);
}
