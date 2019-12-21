package transaction.file;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import transaction.constant.Priority;
import transaction.constant.TransactionType;
import transaction.dto.TransactionDetail;

public class EXCELFileReader extends InputFile {

	@Override
	public List<TransactionDetail> getData(InputFile file) {
		TransactionDetail input = new TransactionDetail();
		input.setPriority(Priority.N);
		input.setType(TransactionType.SELL);
		input.setClientId("ABC");
		input.setTransactionDate(new Date());
		input.setSecurityId("DEF");
		TransactionDetail input1 = new TransactionDetail();
		input1.setPriority(Priority.N);
		input1.setType(TransactionType.BUY);
		input1.setClientId("ABC");
		input1.setTransactionDate(new Date());
		input1.setSecurityId("DEF");
		List<TransactionDetail> list = new ArrayList<TransactionDetail>();
		list.add(input);
		list.add(input1);
		return list;
	}

}
