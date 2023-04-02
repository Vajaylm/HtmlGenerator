package com.vajay.html.api;

public class HtmlParagraph extends HtmlElement {

	public HtmlParagraph() {
		super(null);
	}
	
	public HtmlParagraph(String text) {
		super(text);
	}

	@Override
	protected String getTagName() {
		return "p";
	}

}
