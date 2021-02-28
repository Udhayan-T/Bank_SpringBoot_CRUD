package com.bankmanagement.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "customerId")
	private Long customerId;
	@Column(name = "customerName")
	private String name;
	@Column(name = "accountNumber")
	private String accountNumber;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "gender")
	private String gender;
	@Column(name = "dob")
	private String dob;
	@Column(name = "registrationDate")
	private String registrationDate;
	@Column(name = "bankName")
	private String bankName;
	@Column(name = "branchName")
	private String branchName;
	@Column(name = "identificationProof")
	private String identificationProof;
	@Column(name = "identificationNumber")
	private String identificationNumber;
	@Column(name = "refAccHolderName")
	private String refAccHolderName;
	@Column(name = "refAccHolderNumber")
	private String refAccHolderNumber;
	@Column(name = "refAccHolderAddress")
	private String refAccHolderAddress;
	@Column(name = "address")
	private String address;
	@Column(name = "contactNumber")
	private String contactNumber;
	@Column(name = "mailId")
	private String mailId;
	@Column(name = "martialStatus")
	private String martialStatus;
	@Column(name = "accType")
	private String accType;
	@Column(name = "citizenship")
	private String citizenship;
	@Column(name = "citizenStatus")
	private String citizenStatus;
	@Column(name = "guardianType")
	private String guardianType;
	@Column(name = "guardianName")
	private String guardianName;
	@Column(name = "accountType")
	private String accountType;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIdentificationProof() {
		return identificationProof;
	}
	public void setIdentificationProof(String identificationProof) {
		this.identificationProof = identificationProof;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getRefAccHolderName() {
		return refAccHolderName;
	}
	public void setRefAccHolderName(String refAccHolderName) {
		this.refAccHolderName = refAccHolderName;
	}
	public String getRefAccHolderNumber() {
		return refAccHolderNumber;
	}
	public void setRefAccHolderNumber(String refAccHolderNumber) {
		this.refAccHolderNumber = refAccHolderNumber;
	}
	public String getRefAccHolderAddress() {
		return refAccHolderAddress;
	}
	public void setRefAccHolderAddress(String refAccHolderAddress) {
		this.refAccHolderAddress = refAccHolderAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getCitizenStatus() {
		return citizenStatus;
	}
	public void setCitizenStatus(String citizenStatus) {
		this.citizenStatus = citizenStatus;
	}
	public String getGuardianType() {
		return guardianType;
	}
	public void setGuardianType(String guardianType) {
		this.guardianType = guardianType;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", customerId=" + customerId + ", name=" + name + ", accountNumber="
				+ accountNumber + ", country=" + country + ", state=" + state + ", gender=" + gender + ", dob=" + dob
				+ ", registrationDate=" + registrationDate + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", identificationProof=" + identificationProof + ", identificationNumber=" + identificationNumber
				+ ", refAccHolderName=" + refAccHolderName + ", refAccHolderNumber=" + refAccHolderNumber
				+ ", refAccHolderAddress=" + refAccHolderAddress + ", address=" + address + ", contactNumber="
				+ contactNumber + ", mailId=" + mailId + ", martialStatus=" + martialStatus + ", accType=" + accType
				+ ", citizenship=" + citizenship + ", citizenStatus=" + citizenStatus + ", guardianType=" + guardianType
				+ ", guardianName=" + guardianName + ", accountType=" + accountType + "]";
	}

}