package transaction;

import java.util.Comparator;
import java.util.List;

import transaction.constant.FileType;
import transaction.dto.TransactionDetail;
import transaction.file.FileFactory;
import transaction.file.InputFile;
import transaction.handler.HighPriorityTransactionHandler;
import transaction.handler.IntradayTransactionHandler;
import transaction.handler.NormalPriorityBuyAndDepositTransactionHandler;
import transaction.handler.NormalPrioritySellAndWithdrawTransactionHandler;
import transaction.handler.TransactionHandler;

public class FeeCalulcator {
	public static List<TransactionDetail> process(Comparator<TransactionDetail> comp,FileType type){
		FileFactory fact = FileFactory.getInstance();
		InputFile file = fact.produceFileReaderObject(type);
		List<TransactionDetail> list = file.getData(file);
		TransactionHandler handler1 = new HighPriorityTransactionHandler();
		TransactionHandler handler2 = new NormalPrioritySellAndWithdrawTransactionHandler();
		TransactionHandler handler3 = new NormalPriorityBuyAndDepositTransactionHandler();
		IntradayTransactionHandler handler4 = new IntradayTransactionHandler();
		
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		handler4.setTransactionList(list);
		
		for(TransactionDetail tran:list){
			handler1.calculateProcessingFee(tran);
			handler4.calculateProcessingFee(tran);
		}
		
		return list;
	}
}
