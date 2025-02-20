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
@Table(name = "so_dis_item_excpt")
@IdClass(DiscountItemExcCompKey.class)
public class DiscountItemException {
	@Id
	@Column(name="so_disc_code",length=20,  nullable = false)
	private String ditxCode;
	
	@Id
	@Column(name="so_seq_no",nullable = false)
	private Integer ditxSeq;
	
	@Id
	@Column(name="so_it_item",length=20,  nullable = false)
	private String ditxItem;
	
	@Column(name="so_status",length=2,  nullable = false)
	private String ditxStatus;

	@Column(name="so_user_cre",length=15)
	private String ditxUserCre;
	
	@Column(name="so_date_cre")
	private Date ditxDatecreate;
	
	@Column(name="so_user_upd",length=15)
	private String ditxUserUpd;
	
	@Column(name="so_date_upd")
	private Date ditxDateUpdt;
}
