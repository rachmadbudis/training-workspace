package com.rcs.ind.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum RelationEnum {
	UNKNOWN("com.rcs.ind.relation.unknown","Onbekend"),
	PRA("com.rcs.ind.relation.pra","PRA"),
	SPOUSE("com.rcs.ind.relation.spouse","Echtgeno(o)t(e)"),
	REGISTEREDPARTNER("com.rcs.ind.relation.registeredpartner","Geregistreerd partner"),
	RELATEDPARTNER("com.rcs.ind.relation.relatedpartner","Gerelateerd partner (partner)"),
	PARTNER("com.rcs.ind.relation.partner","Partner"),
	REFERENTPARTNER("com.rcs.ind.relation.referentpartner","Referent (partner)"),
	ADOPTIVECHILD("com.rcs.ind.relation.adoptivechild","Adoptief kind"),
	ADOPTIVEPARENT("com.rcs.ind.relation.adoptiveparent","Adoptie-ouder"),
	BIOLOGICALCHILD("com.rcs.ind.relation.biologicalchild","Biologisch kind"),
	BIOLOGICALFATHER("com.rcs.ind.relation.biologicalfather","Biologische vader"),
	SIBLING("com.rcs.ind.relation.sibling","Broer/zus"),
	RECOGNIZEROFCHILD("com.rcs.ind.relation.recognizerofchild","Erkenner van het kind"),
	GUESTCHILD("com.rcs.ind.relation.guestchild","Gastkind"),
	GUESTPARENT("com.rcs.ind.relation.guestparent","Gastouder"),
	RELATEDPARTNERFAMILY("com.rcs.ind.relation.relatedpartnerfamily","Gerelateerd partner (gezin)"),
	CHILD("com.rcs.ind.relation.child","Kind"),
	ADULTFAMILYMEMBER("com.rcs.ind.relation.adultfamilymember","Meerderjarig gezinslid"),
	UNDERAGEFAMILYMEMBER("com.rcs.ind.relation.underagefamilymember","Minderjarig gezinslid"),
	PARENT("com.rcs.ind.relation.parent","Ouder"),
	FOSTERCHILD("com.rcs.ind.relation.fosterchild","Pleegkind"),
	FOSTERPARENT("com.rcs.ind.relation.fosterparent","Pleegouder"),
	REFERENTFAMILY("com.rcs.ind.relation.referentfamily","Referent (gezin)"),
	STEPCHILD("com.rcs.ind.relation.stepchild","Stiefkind"),
	STEPPARENT("com.rcs.ind.relation.stepparent","Stiefouder"),
	CAREROFCHILD("com.rcs.ind.relation.carerofchild","Verzorger van het kind"),
	GREATGRANDCHILD("com.rcs.ind.relation.greatgrandchild","Achterkleinkind"),
	GRANDPARENT("com.rcs.ind.relation.grandparent","Grootouder"),
	GRANDCHILD("com.rcs.ind.relation.grandchild","Kleinkind"),
	COUSIN("com.rcs.ind.relation.cousin","Neef/nicht"),
	UNCLEAUNT("com.rcs.ind.relation.uncleaunt","Oom/tante"),
	GREATGRANDPARENT("com.rcs.ind.relation.greatgrandparent","Overgrootouder"),
	OTHERFAMILYMEMBER("com.rcs.ind.relation.otherfamilymember","Overig familielid"),
    ;

    private static final Map<String, RelationEnum> lookupIndigoKey = new HashMap<>();

    private final String key;
    private final String indigoKey;

    RelationEnum(String key, String indigoKey) {
        this.key = key;
        this.indigoKey = indigoKey;
    }

    public String getKey() {
        return key;
    }

    public String getIndigoKey() {
        return indigoKey;
    }

    static {
        for (RelationEnum re : RelationEnum.values()) {
            lookupIndigoKey.put(re.getIndigoKey(), re);
        }
    }

    public static RelationEnum getByIndigoKey(String value) {
    	if(lookupIndigoKey.get(value)!=null) return lookupIndigoKey.get(value);
    	else return UNKNOWN;
    }
    
}
