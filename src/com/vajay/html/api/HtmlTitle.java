package com.vajay.html.api;

public class HtmlTitle extends HtmlElement {

	public HtmlTitle(String text) {
		super(text);
	}

	@Override
	protected String getTagName() {
		return "title";
	}

}
