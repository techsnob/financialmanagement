package com.techsnob.fm.transformers;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.techsnob.fm.po.AddBankAccountPO;
import com.techsnob.fm.to.AddBankAccountTO;
@Component
public class BankAccountTransformer {
	public AddBankAccountTO transform (AddBankAccountPO addBankAccountPO) {
		AddBankAccountTO addBankAccountTO = new AddBankAccountTO();
		BeanUtils.copyProperties(addBankAccountPO, addBankAccountTO);
		addBankAccountTO.setCreatedBy(addBankAccountPO.getAccountNickName());
		addBankAccountTO.setCreatedDate(new Timestamp(new Date().getTime()));
		addBankAccountTO.setLastUpdated(new Timestamp(new Date().getTime()));
		return addBankAccountTO;
	}
}
