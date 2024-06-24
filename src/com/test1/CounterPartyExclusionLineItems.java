package com.test1;

public class CounterPartyExclusionLineItems {
	private Integer lineItemCode;
	private String counterPartyExclusionRef;
	private boolean exclusionValid;
	private Integer excludedRuleContentCode;
	private String excludedRuleContent;
	private String metadata;
	private Integer keyIdentifier;
	private Integer secretCode;
	private String keyRotationclient;
	private Integer lineItemReference;
	private String keyRotationSchedule;
	private String status;
	private String remarks;

	public CounterPartyExclusionLineItems() {

	}

	public CounterPartyExclusionLineItems(Integer lineItemCode, String counterPartyExclusionRef, boolean exclusionValid,
			Integer excludedRuleContentCode, String excludedRuleContent, String metadata, Integer keyIdentifier,
			Integer secretCode, String keyRotationclient, Integer lineItemReference, String keyRotationSchedule,
			String status, String remarks) {
		super();
		this.lineItemCode = lineItemCode;
		this.counterPartyExclusionRef = counterPartyExclusionRef;
		this.exclusionValid = exclusionValid;
		this.excludedRuleContentCode = excludedRuleContentCode;
		this.excludedRuleContent = excludedRuleContent;
		this.metadata = metadata;
		this.keyIdentifier = keyIdentifier;
		this.secretCode = secretCode;
		this.keyRotationclient = keyRotationclient;
		this.lineItemReference = lineItemReference;
		this.keyRotationSchedule = keyRotationSchedule;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getLineItemCode() {
		return lineItemCode;
	}

	public void setLineItemCode(Integer lineItemCode) {
		this.lineItemCode = lineItemCode;
	}

	public String getCounterPartyExclusionRef() {
		return counterPartyExclusionRef;
	}

	public void setCounterPartyExclusionRef(String counterPartyExclusionRef) {
		this.counterPartyExclusionRef = counterPartyExclusionRef;
	}

	public boolean isExclusionValid() {
		return exclusionValid;
	}

	public void setExclusionValid(boolean exclusionValid) {
		this.exclusionValid = exclusionValid;
	}

	public Integer getExcludedRuleContentCode() {
		return excludedRuleContentCode;
	}

	public void setExcludedRuleContentCode(Integer excludedRuleContentCode) {
		this.excludedRuleContentCode = excludedRuleContentCode;
	}

	public String getExcludedRuleContent() {
		return excludedRuleContent;
	}

	public void setExcludedRuleContent(String excludedRuleContent) {
		this.excludedRuleContent = excludedRuleContent;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getKeyIdentifier() {
		return keyIdentifier;
	}

	public void setKeyIdentifier(Integer keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}

	public Integer getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(Integer secretCode) {
		this.secretCode = secretCode;
	}

	public String getKeyRotationclient() {
		return keyRotationclient;
	}

	public void setKeyRotationclient(String keyRotationclient) {
		this.keyRotationclient = keyRotationclient;
	}

	public Integer getLineItemReference() {
		return lineItemReference;
	}

	public void setLineItemReference(Integer lineItemReference) {
		this.lineItemReference = lineItemReference;
	}

	public String getKeyRotationSchedule() {
		return keyRotationSchedule;
	}

	public void setKeyRotationSchedule(String keyRotationSchedule) {
		this.keyRotationSchedule = keyRotationSchedule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
