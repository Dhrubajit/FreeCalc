package transaction.file;

import transaction.constant.FileType;

public class FileFactory {
	private FileFactory(){
		
	}
	private static FileFactory factory=new FileFactory();
	
	public static FileFactory getInstance(){
		return factory;
	}
	
	public InputFile produceFileReaderObject(FileType type){
		if(FileType.XML.equals(type)){
			return new CSVFileReader();
		}
		else if(FileType.EXCEL.equals(type)){
			return new EXCELFileReader();
		}
		else if(FileType.CSV.equals(type)){
			return new CSVFileReader();
		}
		else 
			return null;
			
		
	}
	
}
