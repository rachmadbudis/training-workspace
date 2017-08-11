package com.rcs.ind.common;

import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 
 * @author fmiralles
 *
 */
public class JsonModelAndView extends AbstractView {

	private String jsonizedObject;

	public JsonModelAndView(String jsonizedObject) {
		this.jsonizedObject = jsonizedObject;
		this.setContentType("application/json");
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().write(jsonizedObject);
	}

}
