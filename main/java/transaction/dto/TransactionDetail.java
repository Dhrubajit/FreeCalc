package transaction.dto;

import java.util.Date;

import transaction.constant.Priority;
import transaction.constant.TransactionType;

public class TransactionDetail {
	private String clientId;
	private TransactionType type;
	private Date transactionDate;
	private Priority priority;
	private String externalTransactionId;
	private Double marketValue=new Double(0);
	private Double processingFee=new Double(0);
	private String securityId;
	private boolean intraProcessed;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public String getExternalTransactionId() {
		return externalTransactionId;
	}
	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}
	public Double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}
	public Double getProcessingFee() {
		return processingFee;
	}
	public void setProcessingFee(Double processingFee) {
		this.processingFee = processingFee;
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public boolean isIntraProcessed() {
		return intraProcessed;
	}
	public void setIntraProcessed(boolean intraProcessed) {
		this.intraProcessed = intraProcessed;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		TransactionDetail other = (TransactionDetail) obj;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (priority != other.priority)
			return false;
		if (transactionDate == null) {
			if (other.transactionDate != null)
				return false;
		} else if (!transactionDate.equals(other.transactionDate))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TransactionDetail [clientId=" + clientId + ", type=" + type + ", transactionDate=" + transactionDate
				+ ", priority=" + priority + ", externalTransactionId=" + externalTransactionId + ", marketValue="
				+ marketValue + ", processingFee=" + processingFee + ", securityId=" + securityId + ", intraProcessed="
				+ intraProcessed + "]";
	}
	
	
	
}
