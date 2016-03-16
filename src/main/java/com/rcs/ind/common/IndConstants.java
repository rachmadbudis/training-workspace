package com.rcs.ind.common;

public final class IndConstants {

	private IndConstants() {
	}

	// General constants.
	public static final int UNDEFINED = -1;
	public static final String DATE_FORMAT = "dd-MM-yyyy";
	public static final String UNKNOWN_ERROR_KEY = "com.rcs.common.error.unknown";
	public static final String TRIPLE_FORMS = "TripleForms";
	public static final String SYSTEM = "SYSTEM";
	public static final int MARKETPLACE_MAX_ROWS = 10;
	public static final String M117C_DOCUMENT_TITLE = "M117C";
	public static final String DUTCH_YES = "Ja";
	public static final String DUTCH_NO = "Nee";
	public static final String DUTCH_MALE = "Man";
	public static final String DUTCH_FEMALE = "Vrouw";

	// TripleForms constants.
	public static final String XML_ANSWERS_QUESTION_ID = "__XmlAnswers";
	public static final String TRANSLATION_FORM_SCENARIO_ID = "scAsielVertaalFormulier";
	public static final String CUSTOMER_FORM_SCENARIO_ID = "scAsielAanmeldFormulier";
	public static final String TRANSLATED_DOC_NAME = "_Translation_File.pdf";
	public static final String CUSTOMER_DOC_NAME = "_Customer_File.pdf";

	// Generated Document filename
	public static final String TRACK_HISTORY_PDF_NAME = "_Track_History.pdf";
	public static final String INTERVIEW_DOC_PDF_NAME = "_Interview_Document.pdf";

	// User constants
	public static final String DEFAULT_PASSWORD = "test123";
	public static final String INTERVIEWER_FUNCTION = "Hoormedewerker";
	
	// Journal Article constants
	public static final String INTERVIEW_DOC_PREFIX = "interview_doc_";
	public static final String LOGO_FILENAME = "logo_ind";
	
	// Url Key
	public static final String SMARTFLOW_NUMBER_KEY = "smartflowNumber";
	public static final String RESUME_KEY = "resume";
	public static final String APPLICATION_ID_KEY = "applicationId";

	// Nationality Syrian and Eritrean constants
	public static final String ERITREAN = "Eritrese";
	public static final String SYRIAN = "Syrische";
	
	// XML ANSWER KEY
	public static final String QUESTION_NODE = "questions";
	public static final String QUESTION_ID_NODE = "questionid";
	public static final String ANSWER_NODE = "answer";
	public static final String ANSWER_TRANSLATION_NODE = "answertranslation";
	public static final String LANGUAGE_NODE = "answers";
	public static final String LANGUAGE_ATTRIBUTE = "xml:lang";
}
