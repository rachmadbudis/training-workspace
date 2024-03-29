package com.rcs.ind.common.enums;

public enum FileAttachmentEnum {
	INTERVIEW_DOC_PDF_NAME("%s_Interview_Document.pdf", "com.rcs.ind.filename.interview","Verslag gehoor aanmeld fase"),
	TRACK_HISTORY_PDF_NAME("%s_Track_History.pdf", "com.rcs.ind.filename.track.history",""),
	RIC_DOC_NAME("INTERN_%s_RIC_Bevindingen.pdf", "com.rcs.ind.filename.ric","Herkomst indicatie"),
	CUSTOMER_DOC_NAME("%s_Customer_File.pdf", "com.rcs.ind.filename.customer.form", "Formulier persoonsgegevens"),
	TRANSLATED_DOC_NAME("%s_Translation_File.pdf", "com.rcs.ind.filename.translated.form","Formulier persoonsgegevens"),
	PAPER_FORM_DOC_NAME("%s_Paper_Form_File.pdf", "com.rcs.ind.filename.paper.form","Formulier persoonsgegevens"),
	M117C_DOCUMENT_TITLE("M117C_%s.doc", "com.rcs.ind.filename.m117c",""),
	ANTECEDENTEN_VERKLARING_DOCUMENT_TITLE("Antecedentenverklaring_%s.docx", "com.rcs.ind.filename.antecedentenverklaring",""),
	BRP_PROFILE_DOC_NAME("%s_BRP_Profile_Document.docx","com.rcs.ind.filename.brp.profile","Overzicht voor inschrijving BRP"),
	NAREIS_PROFILE_DOC_PDF_NAME("%s_Nareis_Profile_Document.pdf","com.rcs.ind.filename.nareis.profile","Formulier persoonsgegevens tbv Nareis"),
	EMM_XML("Klantformulier_%s.xml","com.rcs.ind.filename.emm.xml",""),
	STATISTIC_REPORT("stats_report_%s.xlsx", "com.rcs.ind.filename.statistic.report.xls",""),
	HVZ_RIC_PACKAGE("", "com.rcs.ind.filename.hvz.attachment","Herkomst indicatie"),
	HVZ_INTERVIEW("%s_Gehoor.docx", "com.rcs.ind.filename.hvz.resettlement.interview", "Gehoor Hervestiging"),
	HVZ_DECISION_RESULT("%s_Beschikking.docx", "com.rcs.ind.filename.hvz.decision.result", "Beschikking Uitgenodigde Vluchteling"),
	HVZ_MINUTES("%s_Minuut.docx", "com.rcs.ind.filename.hvz.resettlement.minutes", "Minuut Hervestiging"),
	HVZ_WERKLIJST("%s - Werklijst - %s.xlsx", "com.rcs.ind.filename.hvz.werklijst", "Werklijst"),
	HVZ_DEFINITIEFLIJST("%s - Definitieflijst - %s.xlsx", "com.rcs.ind.filename.hvz.definitieflijst", "Definitieflijst"),
	HVZ_RIC_ZIP("%s - RIC.zip", "com.rcs.ind.filename.hvz.ric.zip", "Herkomst indicatie"),
	HVZ_BRP_ZIP("%s - BRP.zip", "com.rcs.ind.filename.hvz.brp.zip", "Overzicht voor inschrijving BRP"),
	MISSION_ZIP("%s.zip", "com.rcs.ind.filename.mission.zip", "Mission Documents"),
	;

	private final String fileName;
	private final String key;
	private final String indigoName;

	private FileAttachmentEnum(String fileName, String key, String indigoName) {
		this.fileName = fileName;
		this.key = key;
		this.indigoName = indigoName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getKey() {
		return key;
	}	
	
	public String getIndigoName() {
		return indigoName;
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
