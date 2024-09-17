package com.PromoDiscount.Models;


import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	private String dismCode;
	
	@Column(name="so_disc_descr",length=100)
	private String dismDescr;
	
	@Column(name="so_disc_for",length=1)
	private String dismFor;
	
	@Column(name="so_disc_type",length=1)
	private String dismType;
	
	@Column(name="so_beg_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dismBegDate;
	
	@Column(name="so_end_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dismEndDate;
	
	@Column(name="so_disc_pct_type", length=1)
	private String dismPctType;
	
	@Column(name="so_disc_pct_total")
	private BigDecimal dismPctTotal;
	
	@Column(name="so_disc_amt_total")
	private BigDecimal dismAmtTotal;
	
	@Column(name="so_disc_voucher_amt")
	private BigDecimal dismVoucherAmt;
	
	@Column(name="so_status",length=2)
	private String dismStatus;
	
	@Column(name="so_user_cre",length=15)
	private String dismUserCre;
	
	@Column(name="so_date_cre")
	private Date dismDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String dismUserUpd;
	
	@Column(name="so_date_upd")
	private Date dismDateUpdt;

}
