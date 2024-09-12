package com.PromoDiscount.Services;

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
	
	public List<DiscountDetail> getDiscDtlAll(){
		return reporDisd.findAll();
	}
	
}
