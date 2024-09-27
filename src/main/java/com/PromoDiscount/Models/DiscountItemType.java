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
@Table(name = "so_dis_item")
@IdClass(DiscountItemTypeCompKey.class)
public class DiscountItemType {
	
	@Id
	@Column(name="so_disc_code",length=20,  nullable = false)
	private String dityCode;
	
	@Id
	@Column(name="so_seq_no",nullable = false)
	private Integer ditySeq;
	
	@Id
	@Column(name="so_it_type",length=20,  nullable = false)
	private String dityItype;
	
	@Column(name="so_status",length=2,  nullable = false)
	private String dityStatus;

	@Column(name="so_user_cre",length=15)
	private String dityUserCre;
	
	@Column(name="so_date_cre")
	private Date dityDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String dityUserUpd;
	
	@Column(name="so_date_upd")
	private Date dityDateUpdt;
	
	
}
