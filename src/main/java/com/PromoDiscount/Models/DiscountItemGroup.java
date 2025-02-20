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
@Table(name = "so_dis_itgroup")
@IdClass(DiscountItemGroupCompKey.class)
public class DiscountItemGroup {

	@Id
	@Column(name="so_dis_code",length=20,  nullable = false)
	private String digrCode;
	
	@Id
	@Column(name="so_seq_no",nullable = false)
	private Integer digrSeq;
	
	@Id
	@Column(name="so_it_group",length=20,  nullable = false)
	private String digrItGroup;
	
	@Column(name="so_status",length=2,  nullable = false)
	private String digrStatus;

	@Column(name="so_user_cre",length=15)
	private String digrUserCre;
	
	@Column(name="so_date_cre")
	private Date digrDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String digrUserUpd;
	
	@Column(name="so_date_upd")
	private Date digrDateUpdt;
	
}
