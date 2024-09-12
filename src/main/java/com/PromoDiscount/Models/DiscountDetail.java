package com.PromoDiscount.Models;

import java.math.BigDecimal;
import java.util.Date;



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
	private String DisdCode;	

	@Id
	@Column(name="so_seq_no",  nullable = false)
	private Integer DisdSeqNo;
	
	@Column(name="so_dis_beg")
	private BigDecimal DisdBeg;
	
	@Column(name="so_dis_end")
	private BigDecimal DisdEnd;
	
	@Column(name="so_disc_pct")
	private BigDecimal DisdPct;
	
	@Column(name="so_disc_amt")
	private BigDecimal DisdAmount;
	
	@Column(name="so_status",length=2)
	private String DisdStatus;	
	
	@Column(name="so_user_cre",length=15)
	private String DisdUserCre;
	
	@Column(name="so_date_cre")
	private Date DisdDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String DisdUserUpd;
	
	@Column(name="so_date_upd")
	private Date DisdDateUpdt;
	
}
