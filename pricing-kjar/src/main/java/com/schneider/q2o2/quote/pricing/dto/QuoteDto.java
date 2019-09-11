package com.schneider.q2o2.quote.pricing.dto;

public class QuoteDto  {
	
	private String id;
	private String version;
	private String correlationId;
	private String opportunityId;
	private String accountId;
	private String opportunityName;
	private int revision;
	private Double price;

	public QuoteDto() {
		super();
	}


	public QuoteDto(String id, String version, String correlationId, String opportunityId, String accountId,
			String opportunityName, int revision, Double price) {
		super();
		this.id = id;
		this.version = version;
		this.correlationId = correlationId;
		this.opportunityId = opportunityId;
		this.accountId = accountId;
		this.opportunityName = opportunityName;
		this.revision = revision;
		this.price = price;
	}

	public String getOpportunityId() {
		return opportunityId;
	}
	public String getAccountId() {
		return accountId;
	}
	public String getOpportunityName() {
		return opportunityName;
	}
	public int getRevision() {
		return revision;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}
	public void setRevision(int revision) {
		this.revision = revision;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
