package com.vajay.html.api;

import java.security.InvalidParameterException;

public class HtmlHeader extends HtmlElement {
	private int level;

	public HtmlHeader(String text, int level) {
		super(text);
		if (level < 1 || level > 6) {
			throw new InvalidParameterException("A Header szintje 1 - 6 közötti szám lehet csak!");
		}
		this.level = level;
	}

	@Override
	protected String getTagName() {
		return "h" + level;
	}

}
