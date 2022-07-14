package com.psl.alp.UserManagement.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsersLicense {
	
	@Id
	private String licenseKey;
	
	private long userId;

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public UsersLicense(String licenseKey, long userId) {
		super();
		this.licenseKey = licenseKey;
		this.userId = userId;
	}

	public UsersLicense() {
		super();
	}

		
	
	
}
