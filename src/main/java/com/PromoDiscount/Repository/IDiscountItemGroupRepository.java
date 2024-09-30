package com.PromoDiscount.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.PromoDiscount.Models.DiscountItemGroup;
import com.PromoDiscount.Models.DiscountItemGroupCompKey;


@Repository
public interface IDiscountItemGroupRepository  extends JpaRepository<DiscountItemGroup,DiscountItemGroupCompKey>{
		public Optional<DiscountItemGroup> findByDigrCodeAndDigrSeq (String vcode, Integer vseq);
		
		public List<DiscountItemGroup> findByDigrCode (String vcode);
		
		@Procedure(procedureName = "p_update_itemgroup")
		public String runUpdateItemGroup(String p_code, Integer p_seq , String itgroup , 
				String status, String userid, String outmsg);
}
