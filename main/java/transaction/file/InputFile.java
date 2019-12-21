package transaction.file;

import java.util.List;

import transaction.dto.TransactionDetail;

public abstract class InputFile {
	abstract public List<TransactionDetail> getData(InputFile file);
}
