package com.vajay.html.api;

public class HtmlHeader extends HtmlElement {
	private int level;

	public HtmlHeader(String text, int level) {
		super(text);
		this.level = level;
	}

	@Override
	protected String getTagName() {
		return "h" + level;
	}

}
