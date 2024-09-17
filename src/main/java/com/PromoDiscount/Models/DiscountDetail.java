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
@Table(name = "SO_DIS_DET")
@IdClass(DiscountDetailCompKey.class)
public class DiscountDetail {	

	@Id
	@Column(name="so_dis_code",length=20,  nullable = false)
	private String disdCode;	

	@Id
	@Column(name="so_seq_no",  nullable = false)
	private Integer disdSeqNo;
	
	@Column(name="so_dis_beg")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date disdBeg;
	
	@Column(name="so_dis_end")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date disdEnd;
	
	@Column(name="so_disc_pct")
	private BigDecimal disdPct;
	
	@Column(name="so_disc_amt")
	private BigDecimal disdAmount;
	
	@Column(name="so_status",length=2)
	private String disdStatus;	
	
	@Column(name="so_user_cre",length=15)
	private String disdUserCre;
	
	@Column(name="so_date_cre")
	private Date disdDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String disdUserUpd;
	
	@Column(name="so_date_upd")
	private Date disdDateUpdt;
	
}
