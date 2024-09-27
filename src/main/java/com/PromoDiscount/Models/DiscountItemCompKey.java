package com.PromoDiscount.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DiscountItemCompKey implements Serializable {
	
	private String ditmCode;
	
	private Integer ditmSeq;
	
	private String ditmItem;
}
