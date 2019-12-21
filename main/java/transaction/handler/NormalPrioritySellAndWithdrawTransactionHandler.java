package transaction.handler;

import transaction.constant.Priority;
import transaction.constant.TransactionType;
import transaction.dto.TransactionDetail;

public class NormalPrioritySellAndWithdrawTransactionHandler extends TransactionHandler {
	TransactionHandler handler;
	

	public void setNextHandler(TransactionHandler normalTransactionHandler) {
		handler = normalTransactionHandler;

	}

	public void calculateProcessingFee(TransactionDetail tran) {
		// TODO Auto-generated method stub
		if(Priority.N.equals(tran.getPriority()) && (TransactionType.SELL.equals(tran.getType()) || TransactionType.WITHDRAW.equals(tran.getType()))){
			tran.setProcessingFee(tran.getProcessingFee() + 100);
		}
		else
			handler.calculateProcessingFee(tran);
	}
	
	
}
