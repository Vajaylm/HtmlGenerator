package com.vajay.html.api;

public class HtmlLink extends HtmlElement {

	public HtmlLink(String text) {
		super(text);
	}

	@Override
	protected String getTagName() {
		return "a";
	}

}
