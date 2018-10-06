package com.techsnob.fm.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.techsnob.fm.constants.FMConstants;
import com.techsnob.fm.po.AddBankAccountPO;
import com.techsnob.fm.to.AddBankAccountTO;
import com.techsnob.fm.transformers.BankAccountTransformer;

@Controller
public class AddBankController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private BankAccountTransformer transformer;
	
	@RequestMapping(value="/viewAddBankAccount",method=RequestMethod.GET)
	public String showAddBankAccountPage() {
		return "viewAddBankAccount";
	}

	@RequestMapping(value="/addBankAccount", method=RequestMethod.POST)
	@ResponseBody
	public String addBankAccount(AddBankAccountPO addBankAccountPO, HttpServletRequest request) {
		AddBankAccountTO addBankAccountTO = transformer.transform(addBankAccountPO);
		addBankAccountTO.setUserIp(request.getRemoteAddr());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<AddBankAccountTO> request1 = new HttpEntity<AddBankAccountTO>(addBankAccountTO,headers);
		ResponseEntity<Boolean> response = restTemplate.postForEntity("http://localhost:8081/bankaccountmanagement/addBankAccount", request1, Boolean.class);
		if(response.getStatusCodeValue() == FMConstants.HTTP_STATUS_OK) {
			return addBankAccountPO.getAccountPayeeName()+" added successfully"; 
		} else {
			return "Unable to add " + addBankAccountPO.getAccountPayeeName(); 
		}
	}
}
