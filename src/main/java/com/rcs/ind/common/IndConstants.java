package com.rcs.ind.common;

public final class IndConstants {

	private IndConstants() {
	}

	// General constants.
	public static final int UNDEFINED = -1;
	public static final String DATE_FORMAT = "dd-MM-yyyy";
	public static final String DATE_TIME_FORMAT = "dd-MM-yyyy-HHmmss";
	public static final String UNKNOWN_ERROR_KEY = "com.rcs.common.error.unknown";
	public static final String TRIPLE_FORMS = "TripleForms";
	public static final String INDIGO = "Indigo";
	public static final Long INDIGO_USERID = 1L;
	public static final String SYSTEM = "SYSTEM";
	public static final int MARKETPLACE_MAX_ROWS = 10;
	public static final String DUTCH_YES = "Ja";
	public static final String DUTCH_NONE = "Geen";
	public static final String DUTCH_NO = "Nee";
	public static final String DUTCH_OTHERS = "Anders";
	public static final String DUTCH_MALE = "Man";
	public static final String DUTCH_FEMALE = "Vrouw";
	public static final String TYPE_SEPERATOR = ";";

	// User constants
	public static final String DEFAULT_PASSWORD = "test123";
	public static final String INTERVIEWER_FUNCTION = "Hoormedewerker";

	// Journal Article constants
	public static final String INTERVIEW_DOC_PREFIX = "interview_doc_";
	public static final String LOGO_FILENAME = "logo_ind";
	public static final String CUSTOM_QUESTION_FOLDER = "Custom Question";
	public static final String INTERVIEW_FOLDER = "Interview Templates";
	public static final String MINUTES_FOLDER = "Minutes Templates";
	public static final String DECISION_FOLDER = "Decision Templates";
	public static final String HVZ_FOLDER = "HVZ";
	public static final String HVZ_TEMPLATE_NONE = "None";

	// Url Key
	public static final String SMARTFLOW_NUMBER_KEY = "smartflowNumber";
	public static final String RESUME_KEY = "resume";
	public static final String APPLICATION_ID_KEY = "applicationId";
	public static final String CUSTOMER_ID_KEY = "customerId";
	public static final String MISSION_ID_KEY = "missionId";

	// Nationality constants
	public static final String ERITREAN = "Eritrese";
	public static final String SYRIAN = "Syrische";
	public static final String LIBYAN = "Libische";
	public static final String IRAK = "Iraakse";
	public static final String IRAN = "Iraanse";
	public static final String AFGHANISTAN = "Afghaanse";
	public static final String PALESTIJNS = "Palestijns";
	public static final String PALESTIJNS_STAATSLOOS = "Palestijns Staatsloos";
	public static final String PALESTIJNSE_SYRISCHE = "Palestijns Syrische";
	public static final String PALESTIJNSE = "Palestijnse";
	public static final String Marokkaanse = "Marokkaanse";
	public static final String STAATLOOS = "Staatloos";
	public static final String MOROCCAN = "Marokkaans";
	public static final String ALGERIAN = "Algerijnse";
	public static final String TUNISIAN = "Tunesische";
	
	//Country Constant
	public static final String SYRIE = "Syrië";
	
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
	public static final String SIMPLE_TEMPLATE_URL_TITLE = "simple-template";
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
	public static final String ANTECEDENTEN_VERKLARING_URL_TITLE = "antecedenten_verklaring";
	public static final String TRACK_1_EURODAC = "sp1_eurodac";
	public static final String TRACK_1_EUVIS = "sp1_euvis";
	public static final String RIC_PROFILE = "ric_profile";
	public static final String RIC_WORK_YES = "RIC_werkyes";
	public static final String LAST_PLACE_LIVED_OTHER = "last_place_lived_other";
	public static final String LAST_PLACE_LIVED_BIRTHPLACE = "last_place_lived_birthplace";
	public static final String BWST_AMG_MILITARY_VERVANGENDE = "bwst_amg_military_vervangende";
	public static final String BWST_AMG_MILITARY_VRIJGESTELD = "bwst_amg_military_vrijgesteld";
	public static final String BWST_AMG_MILITARY_UITSTEL = "bwst_amg_military_uitstel";
	public static final String RIC_IDENTITEITSKAARTAANGEVRAAGD = "RIC_identiteitskaartaangevraagd";
	public static final String HVZ_INTERVIEW = "HVZ_gehoor_hervestiging";
	public static final String HVZ_DECISION_RESULT = "HVZ_beschikking_uitgenodigde_vluchteling";
	public static final String HVZ_MINUTES = "HVZ_minuut_hervestiging";
	// Drools Rule Filename
	public static final String TRACK_RULE = "Track.drl";
	public static final String RIC_PROFILE_RULE = "RICProfile.drl";
	public static final String BRP_PROFILE_RULE = "BRPProfile.drl";
	public static final String NAREIS_PROFILE_RULE = "NareisProfile.drl";
	public static final String ANDERS_RULE = "anders.drl";
	public static final String HVZ_RULE = "HvzInterview.drl";
	public static final String LOOP_DATA_RULE = "LoopData.drl";

	public static final String RULES_FOLDER_PATH = "/webapps/rules/";
	public static final String INTERVIEW_DOCUMENT_RULES_DIR = "InterviewDocument";
	public static final String BRP_NAREIS_RULES_DIR = "BRP_Nareis";
	public static final String HVZ_RULES_DIR = "HVZ";

	// Tester parameters
	public static final String TESTER_TOKEN = "aNATiCT";

	// Customer form parameters
	public static final String CUSTOMERFORM_FOLDER = "Aanmeldformulier";
	public static final String CUSTOMERFORM_NAME = "Aanmeldformulier_%s.dot";
	
	//This constant is to work around a problem with keys in the xml we recieve 
	public static final String SIMPLIFIED_MANVROUW_KEY ="faanmeldformulierpersonalia.manvrouw";
	
	//This constant is to work around a problem with keys in the xml we recieve (lastname / achternaam) 
	public static final String SIMPLIFIED_ACHTERNAAM_KEY ="faanmeldformulierpersonalia.naamachternaamfamilienaam";
	
	public static final String SIMPLIFIED_ETNICITEIT_KEY = "faanmeldformulierpersonalia.uwetniciteit";
	public static final String SIMPLIFIED_ETNICITEIT_ARABISCH_KEY = "faanmeldformulierpersonalia.uwetniciteitarabisch";
	
	public static final String SIMPLIFIED_RELIGIE_KEY = "faanmeldformulierpersonalia.religie";
	public static final String SIMPLIFIED_RELIGIE_ARABISCH_KEY = "faanmeldformulierpersonalia.religiearabisch";
	
	public static final String SIMPLIFIED_WELKERELIGIEGEBORTE_KEY = "faanmeldformulierpersonalia.welkereligiegeboorte";
	public static final String SIMPLIFIED_WELKERELIGIEGEBORTE_ARABISCH_KEY = "faanmeldformulierpersonalia.welkereligiegeboortearabisch";
	
	public static final String SIMPLIFIED_WATISUWSPREEKTAAL_KEY = "faanmeldformulierleefomgeving.watisuwspreektaal";
	public static final String SIMPLIFIED_WATISUWSPREEKTAAL_ARABISCH_KEY = "faanmeldformulierleefomgeving.watisuwspreektaalarabisch";
	
	public static final String SIMPLIFIED_WELKEANDERETALENSPREEKTU_KEY = "faanmeldformulierleefomgeving.welkeanderetalenspreektu.welkeanderetalenspreektu";
	public static final String SIMPLIFIED_WELKEANDERETALENSPREEKTU_ARABISCH_KEY = "faanmeldformulierleefomgeving.welkeanderetalenspreektuarabisch.welkeanderetalenspreektu";
	
	public static final String SIMPLIFIED_WELKETALENSPREEKTUEENBEETJE_KEY = "faanmeldformulierleefomgeving.welketalenspreektueenbeetje.welketalenspreektueenbeetje";
	public static final String SIMPLIFIED_WELKETALENSPREEKTUEENBEETJE_ARABISCH_KEY = "faanmeldformulierleefomgeving.welketalenspreektueenbeetjearabisch.welketalenspreektueenbeetje";
	
	public static final String SIMPLIFIED_WELKETALENLEERDEU_KEY = "faanmeldformulierleefomgeving.welketalenleerdeu.welketalenleerdeu";
	public static final String SIMPLIFIED_WELKETALENLEERDEU_ARABISCH_KEY = "faanmeldformulierleefomgeving.welketalenleerdeuarabisch.welketalenleerdeu";
	
	public static final String DOCUMENTENBEZIT_WELKEDOCUMENTEN_GENERIC = "faanmeldformulierdocumenten.welkedocumentenbij.welkedocumenten";
	
	public static final String MULTIPLE_NATIONALITIES_PREFIX = "faanmeldformulierpersonalia.nationaliteiten.";
	public static final String MULTIPLE_NATIONALITIES_SUFIX = ".welkenationaliteiten";
	
	// Constants for DDL

	//INDIGO DDL
	public static final String INDIGO_DDL_NAME = "Indigo Codes";
	public static final String INDIGO_CODE = "code";
	public static final String INDIGO_VALUE = "value";

	//RIC Applicable DDL
	public static final String RIC_APPLICABLE_DDL_NAME = "RIC Applicable";
	public static final String RIC_NATIONALITY = "Nationality";
	public static final String RIC_ALWAYS = "Always";
	public static final String RIC_ONLY_IF_NO_DOCUMENTS = "Only_if_no_documents";

	// Location DDL
	public static final String LOCATION_DDL_NAME = "Location";
	public static final String LOCATION = "location";
	public static final String DIRECTORATE = "Directie_Asiel";
	public static final String VISIT_ADDRESS_L1  = "Visit_Address_L1";
	public static final String VISIT_ADDRESS_L2  = "Visit_Address_L2";
	public static final String POST_ADDRESS_L1  = "Post_Address_L1";
	public static final String POST_ADDRESS_L2  = "Post_Address_L2";
	public static final String POST_ADDRESS_L3  = "Post_Address_L3";
	public static final String OPENING_TIMES  = "Opening_times";
	public static final String CONTACT_PERSON_L1  = "Contact_Person_L1";
	public static final String CONTACT_PERSON_L2  = "Contact_Person_L2";
	public static final String CONTACT_PERSON_L3  = "Contact_Person_L3";
	public static final String INTERVIEW_LOCATION = "interviewLocation";

	// Claimland DDL
	public static final String CLAIMLAND_DDL_NAME = "Claimland";
	public static final String CLAIMLAND_VALUE = "claimland";
	public static final String CLAIMLAND_LABEL = "claimlandlabel";
	public static final String CLAIMLAND_EU_COUNTRY = "isEUCountry";

	// Language DDL
	public static final String LANGUAGE_DDL_NAME = "Language";
	public static final String LANGUAGE_VALUE = "language_value";
	public static final String LANGUAGE_LABEL = "language_label";

	// Nationality DDL
	public static final String NATIONALITY_DDL_NAME = "Nationalities";
	public static final String NATIONALITY = "nationalities";
	public static final String NATIONALITY_SAFE_COUNTRY = "safeCountry";
	
	// Mission target groups DDL
	public static final String MISSION_TARGET_GROUPS_DDL_NAME = "Mission Target Groups";
	public static final String MISSION_TARGET_GROUPS_FIELD_VALUE = "value";
	public static final String MISSION_TARGET_GROUPS_FIELD_CODE = "code";

	// Tracks DDL
	public static final String TRACK_DDL_NAME = "Tracks";
	public static final String TRACK_KEY = "Key";
	public static final String TRACK_LABEL = "Label";

	//Statistic Report
	public static final String STATISTIC_SHEET_NAME = "Statistic Report";

	//HVZ Constants
	public static final String HVZ_PRA = "PRA";
	public static final Integer ELLIGIBLE_AGE = 15;
	public static final String FORM_THREAD_PREFIX = "Formulieren - ";
}