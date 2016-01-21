package com.rcs.ind.common;

public class IndConstants {

	private IndConstants() {
	}

	// General constants.
	public static final int UNDEFINED = -1;
	public static final String DATE_FORMAT = "dd-MM-yyyy";
	public static final String UNKNOWN_ERROR_KEY = "com.rcs.common.error.unknown";
	public static final String TRIPLE_FORMS = "TripleForms";
	public static final int MARKETPLACE_MAX_ROWS = 10;

	// TripleForms constants.
	public static final String XML_ANSWERS_QUESTION_ID = "__XmlAnswers";
	public static final String TRANSLATED_DOC_NAME = "_Translation_File.pdf";
	public static final String CUSTOMER_DOC_NAME = "_Customer_File.pdf";
	public static final String TRANSLATOR_NOTE_DOC_NAME = "_Translator_Note_File.pdf";
	public static final String TRANSLATION_FORM_SCENARIO_ID = "scAsielVertaalFormulier";
	public static final String CUSTOMER_FORM_SCENARIO_ID = "scAsielAanmeldFormulier";
	// TODO: change the value for below constant once the scenario for translator note is available
	public static final String TRANSLATOR_NOTE_SCENARIO_ID = "translatorNoteScenario"; // --> Dummy value 

	// User constants
	public static final String DEFAULT_PASSWORD = "test123";
	
	// Url Key
	public static final String SMARTFLOW_NUMBER_KEY = "smartflowNumber";
	public static final String RESUME_KEY = "resume";

}
