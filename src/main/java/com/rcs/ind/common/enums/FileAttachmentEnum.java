package com.rcs.ind.common.enums;

public enum FileAttachmentEnum {
	INTERVIEW_DOC_PDF_NAME("%s_Interview_Document.pdf", "com.rcs.ind.filename.interview"),
	TRACK_HISTORY_PDF_NAME("%s_Track_History.pdf", "com.rcs.ind.filename.track.history"),
	RIC_ZIP_NAME("INTERN_%s_RIC_Bevindingen.zip", "com.rcs.ind.filename.ric.zip"),
	CUSTOMER_DOC_NAME("%s_Customer_File.pdf", "com.rcs.ind.filename.customer.form"),
	TRANSLATED_DOC_NAME("%s_Translation_File.pdf", "com.rcs.ind.filename.translated.form"),
	M117C_DOCUMENT_TITLE("M117C_%s.doc", "com.rcs.ind.filename.m117c"),
	;

	private final String fileName;
	private final String key;
	
	private FileAttachmentEnum(String fileName, String key) {
		this.fileName = fileName;
		this.key = key;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getKey() {
		return key;
	}	
	
	public static FileAttachmentEnum fromFileName(String filename, String smartflowNumber) {
		if (filename != null) {
			for (FileAttachmentEnum e : FileAttachmentEnum.values()) {
				if (filename.toLowerCase().equals(String.format(e.getFileName().toLowerCase(), smartflowNumber))) {
					return e;
				}
			}
		}
		return null;		
	}
}
