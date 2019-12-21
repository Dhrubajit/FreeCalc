package transaction.handler;

import java.util.List;

import transaction.constant.TransactionType;
import transaction.dto.TransactionDetail;

public class IntradayTransactionHandler extends TransactionHandler{
	
	private List<TransactionDetail> transactionList;
	private TransactionHandler handler;

	public List<TransactionDetail> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<TransactionDetail> transactionList) {
		this.transactionList = transactionList;
	}

	public void setNextHandler(TransactionHandler transactionHandler) {
		this.handler = transactionHandler;
		
	}

	public void calculateProcessingFee(TransactionDetail tran) {
		TransactionDetail found = null;
		if(!tran.isIntraProcessed()){
			for(TransactionDetail t:transactionList){
				if(t.getClientId().equals(tran.getClientId())&& t.getSecurityId().equals(tran.getSecurityId())&&t.getTransactionDate().equals(tran.getTransactionDate())&& ((t.getType().equals(TransactionType.SELL)&&tran.getType().equals(TransactionType.BUY))||(t.getType().equals(TransactionType.BUY)&&tran.getType().equals(TransactionType.SELL)))){
					found = t;
					break;
				}
			}
			
			tran.setProcessingFee(tran.getProcessingFee()+10);
			tran.setIntraProcessed(true);
			found.setProcessingFee(found.getProcessingFee()+10);
			found.setIntraProcessed(true);
		}
		
		
	}
	
	

}
