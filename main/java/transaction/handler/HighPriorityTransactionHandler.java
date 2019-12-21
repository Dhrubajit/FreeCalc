package transaction.handler;

import transaction.constant.Priority;
import transaction.dto.TransactionDetail;

public class HighPriorityTransactionHandler extends TransactionHandler {
	
	TransactionHandler handler;

	public void setNextHandler(TransactionHandler normalTransactionHandler) {
		handler = normalTransactionHandler;
		
	}

	public void calculateProcessingFee(TransactionDetail tran) {
		if(Priority.Y.equals(tran.getPriority())){
			tran.setProcessingFee(tran.getProcessingFee()+500);
		}
		else
		{
			handler.calculateProcessingFee(tran);
		}
			
		
	}

}
