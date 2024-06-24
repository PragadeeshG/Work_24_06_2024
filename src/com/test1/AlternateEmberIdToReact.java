package com.test1;

public class AlternateEmberIdToReact {
	private String emberId;
	private String reactCode;
	private String qualityGrade;
	private String emberIdToReactSystem;
	private String emberIdToReactSystemCode;
	private String emberIdToReactSystemDescription;
	private String knownQualityIssues;
	private Integer riskLevel;
	private String mitigation;
	private String approvalCode;
	private String entityState;

	public AlternateEmberIdToReact() {

	}

	public AlternateEmberIdToReact(String emberId, String reactCode, String qualityGrade, String emberIdToReactSystem,
			String emberIdToReactSystemCode, String emberIdToReactSystemDescription, String knownQualityIssues,
			Integer riskLevel, String mitigation, String approvalCode, String entityState) {
		super();
		this.emberId = emberId;
		this.reactCode = reactCode;
		this.qualityGrade = qualityGrade;
		this.emberIdToReactSystem = emberIdToReactSystem;
		this.emberIdToReactSystemCode = emberIdToReactSystemCode;
		this.emberIdToReactSystemDescription = emberIdToReactSystemDescription;
		this.knownQualityIssues = knownQualityIssues;
		this.riskLevel = riskLevel;
		this.mitigation = mitigation;
		this.approvalCode = approvalCode;
		this.entityState = entityState;
	}

	public String getEmberId() {
		return emberId;
	}

	public void setEmberId(String emberId) {
		this.emberId = emberId;
	}

	public String getReactCode() {
		return reactCode;
	}

	public void setReactCode(String reactCode) {
		this.reactCode = reactCode;
	}

	public String getQualityGrade() {
		return qualityGrade;
	}

	public void setQualityGrade(String qualityGrade) {
		this.qualityGrade = qualityGrade;
	}

	public String getEmberIdToReactSystem() {
		return emberIdToReactSystem;
	}

	public void setEmberIdToReactSystem(String emberIdToReactSystem) {
		this.emberIdToReactSystem = emberIdToReactSystem;
	}

	public String getEmberIdToReactSystemCode() {
		return emberIdToReactSystemCode;
	}

	public void setEmberIdToReactSystemCode(String emberIdToReactSystemCode) {
		this.emberIdToReactSystemCode = emberIdToReactSystemCode;
	}

	public String getEmberIdToReactSystemDescription() {
		return emberIdToReactSystemDescription;
	}

	public void setEmberIdToReactSystemDescription(String emberIdToReactSystemDescription) {
		this.emberIdToReactSystemDescription = emberIdToReactSystemDescription;
	}

	public String getKnownQualityIssues() {
		return knownQualityIssues;
	}

	public void setKnownQualityIssues(String knownQualityIssues) {
		this.knownQualityIssues = knownQualityIssues;
	}

	public Integer getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(Integer riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getMitigation() {
		return mitigation;
	}

	public void setMitigation(String mitigation) {
		this.mitigation = mitigation;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
