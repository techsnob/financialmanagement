package com.techsnob.fm.to;

import java.io.Serializable;
import java.sql.Timestamp;

public class AddBankAccountTO implements Serializable{
	
	private static final long serialVersionUID = -7167125690144136888L;
	
	private String accountNumber;
	private String ifscNumber;
	private String accountNickName;
	private String accountPayeeName;
	private String accountEmailId ;
	private String accountPhoneNumber;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp lastUpdated;
	private String userIp;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscNumber() {
		return ifscNumber;
	}
	public void setIfscNumber(String ifscNumber) {
		this.ifscNumber = ifscNumber;
	}
	public String getAccountNickName() {
		return accountNickName;
	}
	public void setAccountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
	}
	public String getAccountPayeeName() {
		return accountPayeeName;
	}
	public void setAccountPayeeName(String accountPayeeName) {
		this.accountPayeeName = accountPayeeName;
	}
	public String getAccountEmailId() {
		return accountEmailId;
	}
	public void setAccountEmailId(String accountEmailId) {
		this.accountEmailId = accountEmailId;
	}
	public String getAccountPhoneNumber() {
		return accountPhoneNumber;
	}
	public void setAccountPhoneNumber(String accountPhoneNumber) {
		this.accountPhoneNumber = accountPhoneNumber;
	}
	
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddBankAccountTO other = (AddBankAccountTO) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}
	
}
