package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.PromoDiscount.Models.DiscountDetail;
import com.PromoDiscount.Models.DiscountDetailCompKey;
import com.PromoDiscount.Models.DiscountMaster;

@Repository
public interface IDiscountDetailRepository  extends JpaRepository<DiscountDetail, DiscountDetailCompKey> {

}
