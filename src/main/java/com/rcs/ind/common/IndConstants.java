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
	public static final String DUTCH_YES = "Ja";
	public static final String DUTCH_NO = "Nee";
	public static final String DUTCH_MALE = "Man";
	public static final String DUTCH_FEMALE = "Vrouw";

	// TripleForms constants.
	public static final String XML_ANSWERS_QUESTION_ID = "__XmlAnswers";
	public static final String TRANSLATION_FORM_SCENARIO_ID = "scAsielVertaalFormulier";
	public static final String PAPER_FORM_SCENARIO_ID = "scAsielDigibetenAanmeldFormulier";
	public static final String CUSTOMER_FORM_SCENARIO_ID = "scAsielAanmeldFormulier";

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
	public static final String IRAK = "Iraakse";
	public static final String IRAN = "Iraanse";
	public static final String AFGHANISTAN = "Afghaanse";

	// Language Constant
	public static final String ARABISCH = "Arabisch";
	public static final String AMHARISCH = "Amharisch";
	public static final String TIGRINYA = "Tigrinya";
	public static final String TIGRE = "Tigré";
	public static final String SAHO = "Saho";
	public static final String AFAR = "Afar";
	public static final String KUNAMA = "Kunama";
	public static final String BEDJA_BEDAWI = "Bedja (Bedawi)";
	public static final String BILEN = "Bilen";
	public static final String NARA = "Nara";
	public static final String DAHLIK = "Dahlik";
	
	// XML ANSWER KEY
	public static final String QUESTION_NODE = "questions";
	public static final String QUESTION_ID_NODE = "questionid";
	public static final String ANSWER_NODE = "answer";
	public static final String ANSWER_TRANSLATION_NODE = "answertranslation";
	public static final String LANGUAGE_NODE = "answers";
	public static final String LANGUAGE_ATTRIBUTE = "xml:lang";

	// TEMPLATE TITLE
	public static final String MASTER_TEMPLATE_URL_TITLE = "master-template";
	public static final String TRACK_1_DOCUMENT_URL_TITLE = "bwst_amg_sp1";
	public static final String TRACK_2A_DOCUMENT_URL_TITLE = "bwst_amg_sp2a";
	public static final String TRACK_2B_DOCUMENT_URL_TITLE = "bwst_amg_sp2b";
	public static final String TRACK_3_DOCUMENT_URL_TITLE = "bwst_amg_sp3";
	public static final String TRACK_4_DOCUMENT_URL_TITLE = "bwst_amg_sp4";
	public static final String MILITARY_ERITREA_TITLE = "bwst_amg_military_eritrea";
	public static final String MILITARY_SYRIA_TITLE = "bwst_amg_military_syria";
	public static final String MILITARY_IRAK_TITLE = "bwst_amg_military_irak";
	public static final String MILITARY_IRAN_TITLE = "bwst_amg_military_iran";
	public static final String MILITARY_AFGHANISTAN_TITLE = "bwst_amg_military_afghanistan";
	public static final String M117C_URL_TITLE = "m117c";
	public static final String TRACK_1_EURODAC = "sp1_eurodac";
	public static final String TRACK_1_EUVIS = "sp1_euvis";
	public static final String RIC_PROFILE = "ric_profile";
	public static final String LAST_PLACE_LIVED_OTHER = "last_place_lived_other";
	public static final String LAST_PLACE_LIVED_BIRTHPLACE = "last_place_lived_birthplace";
	public static final String BWST_AMG_MILITARY_VERVANGENDE = "bwst_amg_military_vervangende";
	public static final String BWST_AMG_MILITARY_VRIJGESTELD = "bwst_amg_military_vrijgesteld";
	public static final String BWST_AMG_MILITARY_UITSTEL = "bwst_amg_military_uitstel";

	// Drools Rule Filename
	public static final String TRACK_RULE = "Track.drl";
	public static final String INTERVIEW_DOCUMENT_RULES_DIR = "InterviewDocument";
	public static final String RIC_PROFILE_RULE = "RICProfile.drl";

	// Tester parameters
	public static final String TESTER_TOKEN = "aNATiCT";

	// Customer form parameters
	public static final String CUSTOMERFORM_FOLDER = "Aanmeldformulier";
	public static final String CUSTOMERFORM_NAME = "Aanmeldformulier_%s.dot";
}