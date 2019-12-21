package transaction.handler;

import transaction.dto.TransactionDetail;

public abstract class TransactionHandler {
	
	
	public abstract void setNextHandler(TransactionHandler normalTransactionHandler);
	public abstract void calculateProcessingFee(TransactionDetail tran);
}
