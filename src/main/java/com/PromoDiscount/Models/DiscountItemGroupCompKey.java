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
public class DiscountItemGroupCompKey implements Serializable {
	private String digrCode;
	
	private Integer digrSeq;
	
	private String digrItGroup;
}
