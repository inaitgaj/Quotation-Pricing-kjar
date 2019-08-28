package com.schneider.q2o2.quote.pricing.dto;

public class QuoteDto  {
	
	private String id;
	private String version;
	private String correlationId;
	private String oppurtunityId;
	private String accountId;
	private String oppurtunityName;
	private int revision;
	private Double price;

	public QuoteDto() {
		super();
	}


	public QuoteDto(String id, String version, String correlationId, String oppurtunityId, String accountId,
			String oppurtunityName, int revision, Double price) {
		super();
		this.id = id;
		this.version = version;
		this.correlationId = correlationId;
		this.oppurtunityId = oppurtunityId;
		this.accountId = accountId;
		this.oppurtunityName = oppurtunityName;
		this.revision = revision;
		this.price = price;
	}

	public String getOppurtunityId() {
		return oppurtunityId;
	}
	public String getAccountId() {
		return accountId;
	}
	public String getOppurtunityName() {
		return oppurtunityName;
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
	public void setOppurtunityId(String oppurtunityId) {
		this.oppurtunityId = oppurtunityId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public void setOppurtunityName(String oppurtunityName) {
		this.oppurtunityName = oppurtunityName;
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
