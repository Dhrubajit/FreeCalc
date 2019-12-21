package transaction.handler;

import transaction.constant.Priority;
import transaction.constant.TransactionType;
import transaction.dto.TransactionDetail;

public class NormalPriorityBuyAndDepositTransactionHandler extends TransactionHandler{
	
	TransactionHandler handler;

	public void setNextHandler(TransactionHandler normalTransactionHandler) {
		// TODO Auto-generated method stub
		handler = normalTransactionHandler;
		
	}

	public void calculateProcessingFee(TransactionDetail tran) {
		if(Priority.N.equals(tran.getPriority()) && (TransactionType.BUY.equals(tran.getType()) || TransactionType.DEPOSIT.equals(tran.getType()))){
			tran.setProcessingFee(tran.getProcessingFee()+50);
		}
		
		
		
	}

}
