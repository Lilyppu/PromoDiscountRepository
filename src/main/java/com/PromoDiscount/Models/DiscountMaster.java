package com.PromoDiscount.Models;


import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SO_DIS_MSTR")
public class DiscountMaster {
	
	@Id
	@Column(name="so_disc_code",length=20,  nullable = false)
	private String DismCode;
	
	@Column(name="so_disc_descr",length=100)
	private String DismDescr;
	
	@Column(name="so_disc_for",length=1)
	private String DismFor;
	
	@Column(name="so_disc_type",length=1)
	private String DismType;
	
	@Column(name="so_beg_date")
	private Date DismBegDate;
	
	@Column(name="so_end_date")
	private Date DismEndDate;
	
	@Column(name="so_disc_pct_type")
	private BigDecimal DismPctType;
	
	@Column(name="so_disc_pct_total")
	private BigDecimal DismPctTotal;
	
	@Column(name="so_disc_amt_total")
	private BigDecimal DismAmtTotal;
	
	@Column(name="so_disc_voucher_amt")
	private BigDecimal DismVoucherAmt;
	
	@Column(name="so_status",length=2)
	private String DismStatus;
	
	@Column(name="so_user_cre",length=15)
	private String DismUserCre;
	
	@Column(name="so_date_cre")
	private Date DismDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String DismUserUpd;
	
	@Column(name="so_date_upd")
	private Date DismDateUpdt;

}
