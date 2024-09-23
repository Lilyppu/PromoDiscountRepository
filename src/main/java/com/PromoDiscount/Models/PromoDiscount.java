package com.PromoDiscount.Models;


import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SO_DIS_DET_PROMO")
@IdClass(PromoDiscountCompKey.class)
public class PromoDiscount {
	@Id
	@Column(name="so_dis_code",length=20,  nullable = false)
	private String dispCode;	

	@Id
	@Column(name="so_seq_no",  nullable = false)
	private Integer dispSeqNo;
	
	@Column(name="so_disc_min")
	private BigDecimal dispMin;
	
	@Column(name="so_disc_mult", length=1)
	private String dispMult;
	
	@Column(name="so_buy_get_qty")
	private BigDecimal dispBuyGetQty;
	
	@Column(name="so_bonus_purchase")
	private BigDecimal dispBonusPurchase;
	
	@Column(name="so_cashback")
	private BigDecimal dispCashBack;
	
	@Column(name="so_ongkir")
	private BigDecimal dispOngkir;
	
	@Column(name="so_voucher")
	private BigDecimal dispVoucher;
	
	@Column(name="so_status", length=2)
	private String dispStatus;

	@Column(name="so_user_cre",length=15)
	private String disdUserCre;
	
	@Column(name="so_date_cre")
	private Date disdDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String disdUserUpd;
	
	@Column(name="so_date_upd")
	private Date disdDateUpdt;

}
