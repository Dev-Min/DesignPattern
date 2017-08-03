package com.systrangroup.factory.design.pattern.adapter;

public class FileParser implements FileIO{

	public String read(String documentType, String path) {
		String content = null;
		if(documentType.equals("doc")) {
			DocParser docReader = new DocParser();
			content = docReader.getContents(path);
		}
		else if(documentType.equals("pdf")) {
			PdfParser pdfReader = new PdfParser();
			content = pdfReader.getText(path);
		}
		else {
			content = "Not support file type : " + documentType;
		}
		return content;
	}

}
