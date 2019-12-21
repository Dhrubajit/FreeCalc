import transaction.FeeCalulcator;
import transaction.constant.FileType;

public class Client {
	public static void main(String[] args) {
		
		
		System.out.println(FeeCalulcator.process((t1,t2)-> t1.getClientId().compareTo(t2.getClientId()), FileType.CSV));
		
	}
}
